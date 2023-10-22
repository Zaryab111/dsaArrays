import java.util.Scanner;

public class Simple {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addition() {
        int data;
        int z; // Declare z here
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                System.out.println("Press 0 if you want to continue. Enter any other number to exit.");
            } else {
                System.out.println("Press 1 if you want data at the beginning, press 2 if you want data at the end, press 3 if you want data at a selected position: ");
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        int position;
                        System.out.println("Enter the location where you want it: ");
                        position = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < position - 1; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                    default:
                        System.out.println("Invalid option. Please enter either 1, 2 or 3.");
                }
                System.out.println("Press 0 if you want to continue. Enter any other number to exit.");
            }

            z = sc.nextInt(); // Use z here
        } while (z == 0);
        
        sc.close(); // Close the scanner
    }

    public void print() {
        Node temp3 = head;
        while (temp3 != null) {
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;
        }
    }

    public static void main(String[] args) {
        Simple ll = new Simple();

        ll.addition();
        ll.print();

    }
}
