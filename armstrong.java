import java.util.Scanner;
public class armstrong {
  public static void main(String[] args) {
    System.out.println("Enter n");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int og=n;
  while(n>0){
    int rem=n%10;
    sum=sum+rem*rem*rem;
    n=n/10;
  }
  if(sum==og)
    System.out.println("Number is Armstrong no");
  else
    System.out.println("Not a Armstrong no");
    sc.close();
  }
}
