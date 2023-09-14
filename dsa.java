abstract class List{
abstract public void print();

public int search(int value){return -1;};
public void addAtStart(int value){};
public  void addAtEnd(int[]arr,int value){};
 /*
 public  void addAtEnd(int[]arr,int value){};
 public  void deleteAtStart(int[]arr){};
 public  void deleteAtEnd(int[]arr){};
 public  void deleteAtLoction(int[]arr,int location){};
 public  void addAtLocation(int[]arr,int location){};*/

}
  class Array extends List{
    int[] arr = new int[10];
    
    Array()
    {
        for (int i=0; i<=9;i++)
        {
            arr[i] = (i + 1);
        }
    }

    public void print() {

        for (int i = 0; i <= 9; i++) {
          System.out.println(arr[i]);
        }
      }
    
    public int search(int value)
      {
        for(int i=0; i<= 9 ;i++) {
    
          if (arr[i] == value)
          {
            return i;
    
          }
        }
        return -1;
  }
public void addAtStart(int value)
{
    for(int i=9; i>0; i--)
    {
        arr[i] = arr[i-1];
    }
    arr[0] = value;
}

}
  class Test
  {
    public static void main(String[] args)
    {
        List arr = new Array();
        arr.print();
        
System.out.println("the element has been found on the index: " + 
arr.search(4));
arr.addAtStart(20);
arr.print();
    }
  }