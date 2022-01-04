package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {

       //создаем первое число
        if (first.next == null) {
            Node node = new Node();
            node.value = value;  //1
            System.out.println("first "+node.value);
            first.next = node;
        }

        if (last.prev == null) {
            //созданное первое число является и последним
            last.prev = first.next;
            return; //завершаем функцию, при следующем запуске мы обойдем эти два if тк наши объекты
            //first и last  уже не null
        }
        //этот корд теперь будет работать при последующеих вызовах функции, тк у нас уже есть первое число
        Node node = new Node();
        node.value = value;  //2

        Node lastNode = last.prev;  //записываем сюда предыдущее значене (например 1, которое мы создали
                                    // при помощи if при первом запуске функции)
        System.out.println("lastNode "+last.prev.value);
        lastNode.next = node; //у предыдущего значения ссылка на следующее значение(например 2)
        node.prev = lastNode; // у текушего значения (2)ссылка на предыдущий (1)
        last.prev = node; //теперь текущее значение (2) является у нас последним



























    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
