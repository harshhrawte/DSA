import java.util.Scanner;
public class large {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();
    System.out.println("Enter c");
    int c = sc.nextInt();

    if (a == b && b == c) {
      System.out.println("All numbers are equal");
    } else if (a == b && a > c) {
      System.out.println("a and b are the largest");
    } else if (a == c && a > b) {
      System.out.println("a and c are the largest");
    } else if (b == c && b > a) {
      System.out.println("b and c are the largest");
    } else if (a > b && a > c) {
      System.out.println("a is largest");
    } else if (b > c) {
      System.out.println("b is largest");
    } else {
      System.out.println("c is largest");
    }

    sc.close();
  }
}
