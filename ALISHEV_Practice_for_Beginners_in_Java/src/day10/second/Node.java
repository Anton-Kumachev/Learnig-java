package day10.second;
/*  Вам необходимо создать двоичное дерево поиска, изображенное на картинке выше.
    Для этого создайте класс “Узел” (англ. Node), который будет содержать поля-ссылки
    на два других узла (левый и правый сын).
    Затем, создайте корневой (англ. root) узел (со значением 20).
    После этого, необходимо реализовать метод, который будет добавлять новые узлы в
    ваше дерево.
    Этот метод должен принимать в качестве аргументов добавляемое значение и ссылку
    на корень дерева. Проходясь по дереву, он должен вставлять новый узел в
    правильное место дерева.

    Когда двоичное дерево, изображенное выше, будет создано, необходимо используя
    рекурсию вывести в консоль все числа из этого двоичного дерева поиска в
    отсортированном виде. Ваше решение должно работать для любого корректного
    двоичного дерева поиска.
    Этому методу необходимо передавать на вход ссылку на корень дерева.*/

//Бинарное дерево

class Node {
      Node left;
      Node right;
      int data;

    public static void main(String[] args) {

        Node node = new Node(20);

        node.addElement(14);
        node.addElement(11);
        node.addElement(16);
        node.addElement(5);
        node.addElement(15);
        node.addElement(8);
        node.addElement(18);
        node.addElement(23);
        node.addElement(27);
        node.addElement(22);
        node.addElement(24);
        node.addElement(150);

        System.out.println("Все элементы Бинарного дерева остортирваонные по возрастанию:");
        node.printInOrder();
    }
    public Node(int data) {
        this.data = data;
    }

    public void addElement(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.addElement(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.addElement(value);
            }
        }
    }

    public  void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.printInOrder();
        }
    }
}
