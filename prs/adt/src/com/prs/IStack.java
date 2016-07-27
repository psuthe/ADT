package com.prs;

/**
 * Created by peter on 7/26/16.
 */
public interface IStack<Item> {

    void push(Item item);

    Item pop();

    boolean isEmpty();

    int size();
}
