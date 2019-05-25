package com.sda.java8;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

class Application {
    public static void main (String[] args) {
// Make queue great again ! Circular queue !

        Queue queue = new Queue();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(10);
        queue.enqueue(40);
        queue.enqueue(50);

        for ( int i =0; i < 5; i++){
            System.out.println(queue.dequeue()+ " ");
        }


    }
//        Stack myStack = new Stack();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(35);
//        myStack.push(25);
//        myStack.push(40);
//        myStack.push(45);
//        myStack.push(330);
//        myStack.push(333);
//
//        myStack.pop();
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
//        System.out.println();
//        Queue myQueue = new Queue();
//        myQueue.enqueue(10);
//        myQueue.enqueue(30);
//        myQueue.enqueue(20);
//        System.out.println(myQueue);
//
//
//        System.out.println();
//
//        StringStack myStringStack = new StringStack();
//        myStringStack.push("it!");
//        myStringStack.push("do");
//        myStringStack.push("can");
//        myStringStack.push("I");
//
//        System.out.println(myStringStack);
//
//
//
//        myStringStack.pop();
//        System.out.println(myStringStack);
//        myStringStack.pop();
//        System.out.println(myStringStack);
//        myStringStack.pop();
//        System.out.println(myStringStack);
//        myStringStack.pop();
//        System.out.println(myStringStack);
//        System.out.println();
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a list of strings : ");
////        String str = sc.nextLine();
////        System.out.println("You enter : " + "'" + sc.nextLine() +"'" );
//
//        return ;
//    }

    }





