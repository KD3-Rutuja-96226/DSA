import java.util.Scanner;

public class Que3 {

    // ----------- Node Class -----------
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ----------- Stack Implementation -----------
    static class Stack {
        private Node top;

        public Stack() {
            top = null;
        }

        // Push
        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            System.out.println(value + " pushed into stack");
        }

        // Pop
        public void pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }

        // Peek
        public void peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Top element: " + top.data);
        }

        // Display
        public void display() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = top;
            System.out.print("Stack: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // ----------- Queue Implementation -----------
    static class Queue {
        private Node front, rear;

        public Queue() {
            front = rear = null;
        }

        // Enqueue
        public void enqueue(int value) {
            Node newNode = new Node(value);

            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            System.out.println(value + " inserted into queue");
        }

        // Dequeue
        public void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(front.data + " removed from queue");
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }

        // Display
        public void display() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // ----------- Main Method -----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();
        Queue queue = new Queue();

        int choice;

        do {
            System.out.println("\n1. Push (Stack)");
            System.out.println("2. Pop (Stack)");
            System.out.println("3. Peek (Stack)");
            System.out.println("4. Display Stack");
            System.out.println("5. Enqueue (Queue)");
            System.out.println("6. Dequeue (Queue)");
            System.out.println("7. Display Queue");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    stack.push(sc.nextInt());
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.print("Enter value: ");
                    queue.enqueue(sc.nextInt());
                    break;

                case 6:
                    queue.dequeue();
                    break;

                case 7:
                    queue.display();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}