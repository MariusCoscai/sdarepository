package com.sda.java8;

public class Queue {
    private static final int MAX_SIZE = 4;
    private int[] queue = new int[MAX_SIZE];
    private int tail = -1;
    private int head =0;

    void enqueue(int val) {


        // Varianata estinsa a operatiei de modulo

//        if (tail == MAX_SIZE - 1) {
//            tail = 0;
//        }else {
//            tail++;
//        }
        // Evitam suprascrierea elementelor existente (head)
        // daca nu este primul element  si urmatorul element(tail+1) se suprapune pe HEAD
        if (( tail != -1) && (((tail+1) % MAX_SIZE )==head)){
            return;  // TODO : replace with return boolean
        }
        // Incrementam circular indexul
        tail = (tail+1) % MAX_SIZE;
        queue[tail] = val;
        return;
    }

    int dequeue() {
        if(head > tail){   // TODO : fix to avoid indexing on not
            System.out.println(" No elements ");
        }
        int val = queue[head];
        // Incrementam circular indexul
        head = (head + 1) % MAX_SIZE;
        return val;
    }

}
