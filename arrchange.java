import java.util.Scanner;
import java.util.Arrays;
public class arrchange {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String []str=new String[4];
  for(int i=0;i<str.length;i++){
    str[i]=sc.next(); }
    System.out.println(Arrays.toString(str));
    int []arr={1,3,5,6};
     change(arr);
     System.out.println(Arrays.toString(arr)); 
     sc.close();
  }
  static void change(int []nums){
  nums[0]=99;
  }
}

