package com.sda.java8;

class Application {
    public static void main (String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(35);
        myStack.push(25);
        myStack.push(40);
        myStack.push(45);
        myStack.push(330);
        myStack.push(333);

        myStack.pop();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}

