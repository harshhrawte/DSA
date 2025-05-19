import java.util.Scanner;
class calci{
  void calcu(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform: 1.ADD, 2.SUB, 3.MUL, 4.DIV, 5.MOD");
        int n = sc.nextInt();
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Error: Modulo by zero is not allowed");
                } else {
                    System.out.println("Result: " + (a % b));
                }
                break;
            default:
                System.out.println("Invalid operation selected");
                break;
        }

        sc.close();
  }
}
public class calculator {
    public static void main(String[] args) {
        calci obj=new calci();
        obj.calcu();
    }
}
