public class Que1 {

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

   
    public int findLevel(Node root, int key) {
        int level = 0;

        while (root != null) {
            if (root.data == key)
                return level;

            else if (key < root.data)
                root = root.left;
            else
                root = root.right;

            level++;
        }

        return -1; 
    }

    public static void main(String[] args) {
        Que1 tree = new Que1();

       
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        int key = 60;

        int level = tree.findLevel(tree.root, key);

        if (level != -1)
            System.out.println("Level of " + key + " is: " + level);
        else
            System.out.println("Node not found");
    }
}