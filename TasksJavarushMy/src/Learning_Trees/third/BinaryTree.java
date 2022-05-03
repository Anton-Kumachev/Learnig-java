package Learning_Trees.third;

//Check if a Tree is a BST or Not

public class BinaryTree {
    static class Node {
        //instance variable of Node class
        public int data;
        public Node left;
        public Node right;
        //constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // instance variable of binary tree class
    public Node root;
    // constructor for initialise the root to null BYDEFAULT
    public BinaryTree() {
        this.root = null;
    }
    // method to check the given tree is Binary search tree or not
    public boolean isBSTOrNot() {
        return isBSTOrNot(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBSTOrNot(Node root, int minValue, int maxValue) {
        // check for root is not null or not
        if (root == null) {
            return true;
        }
        // check for current node value with left node value and right node value and recursively check for left
        // sub tree and right sub tree
        if(root.data >= minValue && root.data <= maxValue && isBSTOrNot(root.left, minValue, root.data) &&
                isBSTOrNot(root.right, root.data, maxValue)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating the object of BinaryTree class
        BinaryTree bt = new BinaryTree();
        bt.root= new Node(20); //root

        bt.root.left= new Node(14); //left root
        bt.root.left.left= new Node(11);
        bt.root.left.left.left= new Node(5);
        bt.root.left.left.left.right= new Node(8);
        bt.root.left.right= new Node(16);
        bt.root.left.right.left= new Node(15);
        bt.root.left.right.right= new Node(18);

        bt.root.right= new Node(23); //right root
        bt.root.right.left= new Node(22); //right root
        bt.root.right.right= new Node(27); //right root
        bt.root.right.right.left= new Node(24); //right root
        bt.root.right.right.right= new Node(150); //right root

        System.out.println(bt.isBSTOrNot());
    }
}
