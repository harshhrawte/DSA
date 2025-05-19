import java.util.Scanner;
class sum{
  public static void main(String[] args) {
    System.out.println("Enter a:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("Enter b:");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("The sum of two numbers is \n"+sum);
  sc.close();
  }
}