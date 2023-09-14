abstract class List{
abstract public void print(int[] arr);

abstract public int search(int[] arr,int value);

 public void addAtStart(int[]arr,int value){};
 public  void addAtEnd(int[]arr,int value){};
 public  void deleteAtStart(int[]arr){};
 public  void deleteAtEnd(int[]arr){};
 public  void deleteAtLoction(int[]arr,int location){};
 public  void addAtLocation(int[]arr,int location){};

}
  class Array extends List{
    int[]arr;
    Array(){
        for (int i=0; i<=9;i++)
        {
            arr[i] = (i + 1);
        }
    }

    public void print(int[] arr) {

        for (int i = 0; i <= 9; i++) {
          System.out.println(arr[i]);
        }
      }
    
    public int search(int[]arr,int value)
      {
        for(int i=0; i<= 9 ;i++) {
    
          if (arr[i] == value)
          {
            return i;
    
          }
        }
        return -1;
  }

  }