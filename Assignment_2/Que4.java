public class Que4 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node last; 
    
    public void addAtPosition(int pos, int value) {
        Node newNode = new Node(value);

       
        if (last == null) {
            if (pos != 1) {
                System.out.println("Invalid position");
                return;
            }
            last = newNode;
            last.next = last;
            return;
        }

        Node first = last.next;

        
        if (pos == 1) {
            newNode.next = first;
            last.next = newNode;
            return;
        }

        
        Node temp = first;
        for (int i = 1; i < pos - 1 && temp != last; i++) {
            temp = temp.next;
        }

      
        if (temp == last && pos > 2) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        
        if (temp == last) {
            last = newNode;
        }
    }

  
    public void deleteAtPosition(int pos) {

       
        if (last == null) {
            System.out.println("List is empty");
            return;
        }

        Node first = last.next;

       
        if (pos == 1) {
            // Only one node
            if (first == last) {
                last = null;
                return;
            }

            last.next = first.next;
            return;
        }

       
        Node temp = first;
        for (int i = 1; i < pos - 1 && temp.next != first; i++) {
            temp = temp.next;
        }

       
        if (temp.next == first) {
            System.out.println("Invalid position");
            return;
        }

        Node toDelete = temp.next;
        temp.next = toDelete.next;

        if (toDelete == last) {
            last = temp;
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println();
    }

  
    public static void main(String[] args) {
        Que4 list = new Que4();

        list.addAtPosition(1, 10);
        list.addAtPosition(2, 20);
        list.addAtPosition(3, 30);
        list.addAtPosition(2, 15);

        System.out.print("List: ");
        list.display();

        list.deleteAtPosition(1);
        System.out.print("After deleting position 1: ");
        list.display();

        list.deleteAtPosition(3);
        System.out.print("After deleting position 3: ");
        list.display();
    }
}