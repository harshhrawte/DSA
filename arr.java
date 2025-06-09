import java.util.*;
public class arr{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n");
  int n=sc.nextInt();
  System.out.println("Enter the elements of array");
  int []arr=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
    System.out.println(arr[i]);
  }
   System.out.println(Arrays.toString(arr));
  sc.close();
}
}

 
/*import java.util.Scanner;
import java.util.Arrays;
public class arr {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int n=sc.nextInt();
    System.out.println("Enter the elements of array");
    int []arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      System.out.println(arr[i]);
    }
    sc.close();
    System.out.println(Arrays.toString(arr));

    //print 2d array
    for(int rows=0;rows<3;rows++){
      for(int col=0;col<[rows.length];col++)
      arr[rows][col]
    }
  }
*/
