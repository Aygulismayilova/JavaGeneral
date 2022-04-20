package Collections;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addFirst("C");
        System.out.println(list);
        //linkedlist is like arraylist
        //difference between linked list and arraylist is that
        //you cannot provide capasity in linked list but it can be expanded.
   /*     System.out.println(list.pop());
        System.out.println(list);*/
        System.out.println(list.peek());
        System.out.println(list);

        System.out.println(list.peekLast());
        System.out.println(list);
    }
}
