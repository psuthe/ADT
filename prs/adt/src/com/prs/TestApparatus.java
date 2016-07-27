package com.prs;

import com.prs.impl.StackLL;

public class TestApparatus {

    public static void main(String[] args) {

        TestApparatus apparatus = new TestApparatus();
        apparatus.testStackLinkedList();

    }

    protected void testStackLinkedList(){

        try {
            IStack<String> stack = new StackLL();
            assertTest(stack.isEmpty(), true);
            assertTestNull(stack.pop());
            assertTest(stack.size(), 0);

            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            stack.push("Fourth");
            stack.push("Fifth");
            assertTest(stack.size(), 5);

            assertTest(stack.pop(), "Fifth");
            assertTest(stack.pop(), "Fourth");
            assertTest(stack.size(), 3);

            stack.push("Fourth-2");
            stack.push("Fifth-2");
            assertTest(stack.size(), 5);

            assertTest(stack.pop(), "Fifth-2");
            assertTest(stack.pop(), "Fourth-2");
            assertTest(stack.pop(), "Third");
            assertTest(stack.pop(), "Second");
            assertTest(stack.pop(), "First");
            assertTest(stack.isEmpty(), true);
            assertTestNull(stack.pop());
            assertTest(stack.size(), 0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void assertTest(boolean value, boolean expected) throws Exception {
        if (value != expected){
            throw new Exception("Assert failed - boolean result not expected");
        }
    }
    public void assertTest(int value, int expected) throws Exception {
        if (value != expected){
            throw new Exception("Assert failed - int result not expected: " + value + " / " + expected);
        }
    }
    public void assertTest(String value, String expected) throws Exception {
        if (!value.equals(expected)){
            throw new Exception("Assert failed - String value:" + value + " not expected:" + expected);
        }
    }
    public void assertTestNull(Object value) throws Exception {
        if (value != null){
            throw new Exception("Assert failed - Null result expected: " + value);
        }
    }
}
