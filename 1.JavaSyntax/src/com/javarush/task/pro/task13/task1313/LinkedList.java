package com.javarush.task.pro.task13.task1313;

public class LinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void print() {
        Node node = first.next;
        while (node != null) {
            System.out.println(node.value);
            node=node.next;
        }
    }


    public void add(String value) {
        //при первом вызове создали первый элемент он же и последний и вышли из функции
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        //последующий вызов функции начнется отсюда
        // тк уже создали элемент в первом вызове
        //создаем следеющий элемент
        Node node = new Node();
        node.value = value;

        //теперь надо переназначить ссылки на предыдущие и последующие элементы
        Node nodeLast = last.prev; //последний элемент он же был и первым
        nodeLast.next = node;//у первого элементы следущий элемент это выше созданный второй
        node.prev = nodeLast;// у второго элемента соответственно предыдущий элемент это который первый и последний созданный в самом начале
        last.prev = node; //теперь последний элементом у нас будет второй созданный


    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("23");
        list.add("24");
        list.add("25");
        list.add("26");
        list.add("27");
        list.print();
    }


    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
