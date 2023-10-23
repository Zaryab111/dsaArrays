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
    public void deletion(){
        int g,h,j;
        Scanner sc = new Scanner(System.in);
        do{
        Node temp4 = head;
        if(head == null)
        {
            System.out.println("Link list is empty");
        }
        else{
            System.out.println("Press 1 if you want to delete data at the beginning, press 2 if you want to delete data at the end, press 3 if you want to delete data at a selected position: ");
            g= sc.nextInt();
            switch(g){
                case 1:
                        temp4 = head;
                        temp4 = temp4.next;
                        head = temp4;
                        break;
                case 2:
                   Node temp5 = head;
                    Node ptr = temp5.next;
                        while(ptr.next!=null)
                        {
                            temp5 = ptr;
                            ptr =ptr.next;
                            
                        } 
                        temp5.next = null;
                        break;
                case 3:
                        System.out.println("enter the location where u want to delete the data; ");
                        h = sc.nextInt();
                        Node temp6 = head;
                        Node ptr1 = temp6.next; 
                        for(int i = 0 ;i<h-1;i++)
                        {
                            temp6 = ptr1;
                            ptr1 = ptr1.next;

                        }
                        temp6.next = ptr1.next;
                        break;
            }
            System.out.println("do u want to delete more? press 3 if yes: ");
            
            }
            j = sc.nextInt();
        }while(j == 3);
        }

    public void print() {
        Node temp3 = head;
        while(temp3 != null) {
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;
        }
    }

    public static void main(String[] args) {
        Simple ll = new Simple();

        ll.addition();
        ll.print();
        ll.deletion();
        ll.print();

    }
}
