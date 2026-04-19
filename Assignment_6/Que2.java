public class Que2 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    
    public Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    
    public Node findSuccessor(Node root, int key) {
        Node successor = null;

        while (root != null) {
            if (key < root.data) {
                successor = root;      
                root = root.left;
            } 
            else if (key > root.data) {
                root = root.right;
            } 
            else {
               
                if (root.right != null)
                    return findMin(root.right); 

                break; 
            }
        }
        return successor;
    }

    public static void main(String[] args) {
        Que2 tree = new Que2();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        int key = 60;

        Node successor = tree.findSuccessor(tree.root, key);

        if (successor != null)
            System.out.println("Successor of " + key + " is: " + successor.data);
        else
            System.out.println("No successor found");
    }
}