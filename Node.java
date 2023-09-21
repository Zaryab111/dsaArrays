// abstract class List{
// abstract public void print();

// public int search(int value){return -1;};
// public void addAtStart(int value){};
// public  void addAtEnd(int value){};
// void insertInArray(int element, int index){};
// public  void deleteAtStart(){}
// public  void deleteAtEnd(){};
// public void bubbleSort(){};
//  /*

//  public  void deleteAtLoction(int[]arr,int location){};
//  public  void addAtLocation(int[]arr,int location){};*/

// }
//   class Array extends List{
//     int[] arr;
//     int n;
//     int N;
//     Array(){// creates an array of 5 elements by default
//         N=5;
//         n=0;
//         arr=new int [N];
//     }

//     //parameterized constructor
//     Array(int size){// creates an array of "size" elements by default
//         N=size;
//         n=0;
//         arr=new int [N];
//     }
//  void insertInArray(int element, int index){
//         if(n==N){
//             System.out.println("Array is full");
//             return;
//         }
//         for(int i=n-1;i>=index;i--){
//             arr[i+1]=arr[i];
//         }
//         arr[index]=element;
//         n++;
//     }
//     public void print() {

//         for (int i = 0; i <n; i++) {
//           System.out.println(arr[i]);
//         }
//       }
    
//     public int search(int value)
//       {
//         for(int i=0; i<=n ;i++) {
    
//           if (arr[i] == value)
//           {
//             return i;
    
//           }
//         }
//         return -1;
//   }
// public void addAtStart(int value)
// {
//     for(int i=n-1; i>0; i--)
//     {
//         arr[i] = arr[i-1];
//     }
//     arr[0] = value;
// }
// public  void deleteAtStart()
// {
//         if(n==0){
//             System.out.println("Array is empty");
//             return;
//         }
//         for(int i=0;i<n-1;i++){
//             arr[i]=arr[i+1];
//         }
//         n--;
//     }
// public  void addAtEnd(int value)
// {
//   for(int i = 0; i<n-1;i++)
//   {
//     arr[i] = arr[i + 1];
//   }
//   arr[n-1] = value;
// }
//  public  void deleteAtEnd()
//  {
//   for(int i = n-1;i>0;i--)
//   {
//     arr[i] = arr[i - 1];
//   }
//   n--;
//  }
//  public void bubbleSort() {
//     int n = arr.length;
//     for (int i = 0; i < n - 1; i++) {
//         for (int j = 0; j < n - i - 1; j++) {
//             if (arr[j] > arr[j + 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }
// }
//   class Test
//   {
//     public static void main(String[] args)
//     {
//         List arr = new Array();
//         arr.insertInArray(1, 0);
//         arr.insertInArray(2, 1);
//         arr.insertInArray(3, 2);
//         arr.insertInArray(4, 3);
//         arr.insertInArray(5, 4);

//         arr.print();
        
// System.out.println("the element has been found on the index: " + 
// arr.search(1));

// arr.addAtStart(20);
// //arr.print(); 
// //arr.addAtEnd(15);
// //arr.print();
// //arr.deleteAtStart();
// //arr.deleteAtEnd();
// arr.print();
// arr.bubbleSort();
// arr.print();

//     }
//   }
public class Node{
     Node next;
     int data;
        int n = 5;
        Node(int element){
            this.data = element;
            this.next = null;
        }
        Node(){
            this.data = 0;
            this.next = null;

        }
       

}
abstract class List extends Node{
abstract void print();
abstract Node search(int element);
abstract void addAtStart(int element);
}


class LinkList extends List{
    Node head;
       
    LinkList(){
        Node n1 = new Node(70);
        Node n2 = new Node(60);
        Node n3 = new Node(50);
        Node n4 = new Node(40);
        Node n5 = new Node(30);
        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
    }


void print()
{
    Node i = head;
    while (i != null)
    {
     System.out.print(i.data+"-> ");
     i = i.next;
    }
}
Node search(int element)
{
Node i = head;
while (i != null){
    if(i.data == element)
    {

        System.out.println("element" +" " +element + " "+ "found at reference");
        return i;
    }
}
return null;
}

void addAtStart(int element)
{
    Node i = new Node(element);
    i.next = head;
    head = i;
       n += 1;     
}
public static void main(String[] args)
{
    LinkList meow = new LinkList(); 
    meow.print();
    meow.search(70);
    meow.addAtStart(100);
    meow.print();
    System.out.println(meow.n);
}
}

