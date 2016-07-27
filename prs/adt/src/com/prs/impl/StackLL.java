package com.prs.impl;

import com.prs.IStack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peter on 7/26/16.
 * LinkedList Stack implementation
 */
public class StackLL<Item> implements IStack<Item> {
    private Node lastNode;
    private int count;

    @Override
    public void push(Item item) {
        Node node = new Node(item, lastNode);
        lastNode = node;
        count++;
    }

    @Override
    public Item pop() {
        if (count <= 0) {
            return null;
        }
        Node previous = lastNode.getPrevious();
        Item item = lastNode.getItem();
        lastNode = previous;
        count--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return size() < 1;
    }

    @Override
    public int size() {
        return count;
    }

    private class Node {
        Item item;
        Node previous;

        public Node(Item item, Node previous){
            this.item = item;
            this.previous = previous;
        }

        public Item getItem(){
            return item;
        }
        public Node getPrevious(){
            return previous;
        }

    }
}
