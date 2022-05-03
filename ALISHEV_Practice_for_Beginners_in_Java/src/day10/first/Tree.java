package day10.first;

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

//Рекурсивный обход в глубину
// Сделал но не совсем в соответствии с заданием:

public class Tree {
    public static void main(String[] args) {
        Node root =
                new Node(20,
                        new Node(14,
                                new Node(11, new Node(5, null, new Node(8)), null),
                                new Node(16, new Node(15), new Node(18))),
                        new Node(23,
                                new Node(22),
                                new Node(27, new Node(24), new Node(150)))) ;
        System.out.println("Сумма дерева: " + root.sum());
        System.out.println("Все элементы Бинарного дерева остортирваонные по возрастанию:");
        root.printInOrder();
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }

        public int sum() { //Суммирование всех чисел дерева, методом рекурсивного обхода дерева в глубину
            int summ = value;

            if (left != null) {
                summ += left.sum();
            }
            if (right != null) {
                summ += right.sum();
            }
            return summ;
        }

        public  void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.print(value + " ");
            if (right != null) {
                right.printInOrder();
            }
        }
    }
}
