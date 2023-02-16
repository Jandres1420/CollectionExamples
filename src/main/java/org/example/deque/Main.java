package org.example.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.addLast("Last Element");
        deque.addFirst("First Element");
        deque.addLast("Last Element x2");
   //     deque.add("Regular Element");

        System.out.println(deque);

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next() + " $n1";
            System.out.println(element);
        }
        /**
        for (String elements: deque){
            System.out.println(elements);
        }*/

        String firstElement = deque.removeFirst();
        System.out.println("Removed First Element: " + firstElement);

        String lastElement = deque.removeLast();
        System.out.println("Removed Last Element: " + lastElement);

        System.out.println(deque);



    }

}
