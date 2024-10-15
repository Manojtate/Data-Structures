import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter element in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element in the array that you want to search");
        int key=sc.nextInt();

        int check=linearSearch(arr,key);
        System.out.println(check==-1 ? "Element is not Present in array":"Element is present at index :- "+check);

    }

    public static int linearSearch(int arr[],int key)
    {
          for(int i=0;i<arr.length;i++)
          {
               if(arr[i] == key)
               return i;
          }
          return -1;
    }
}

/*   Time Complexity: O(n) - where n is the number of elements in the array
     Space Complexity: O(1) - constant extra space used
*/