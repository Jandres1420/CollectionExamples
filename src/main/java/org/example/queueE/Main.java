package org.example.queueE;

import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        /**
        Queue<String> bankQueue
                = new PriorityQueue<>();

        bankQueue.offer("Andres");
        bankQueue.offer("Daniel");
        bankQueue.offer("Bryan");
        bankQueue.offer("Victor");
        bankQueue.offer("Chloe");

        while (!bankQueue.isEmpty()){
            System.out.println(bankQueue);
            System.out.println("Current bank queue " + bankQueue.poll());
        }*/

        Queue<Person> personQueue = new PriorityQueue<>();
        personQueue.offer(new Person("Andres",21));
        personQueue.offer(new Person("Daniel",24));
        personQueue.offer(new Person("Bryan",20));

        while (!personQueue.isEmpty()){
            System.out.println("Current bank queue " + personQueue.poll().toString());
        }

    }
}