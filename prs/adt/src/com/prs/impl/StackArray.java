package com.prs.impl;

import com.prs.IStack;

/**
 * Created by peter on 7/26/16.
 * Stack Array implemtation
 */
public class StackArray<Item> implements IStack<Item> {

    private Item[] items;
    private int count;

    public StackArray(){
        items = (Item[]) new Object[10];
    }

    public StackArray(int initCap){
        items = (Item[]) new Object[initCap];
    }

    @Override
    public void push(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    @Override
    public Item pop() {
        if (isEmpty()) {
            return null;
        }
        Item item = items[count-1];
        items[count-1] = null;
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
}
