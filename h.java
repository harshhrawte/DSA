import java.util.Scanner;
class h{
    public static void main(String[] args) {
    System.out.println("Enter in degree");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    float c=(float)(x*(9.0/5.0)+32);
    System.out.println(c);
    sc.close();
    }
}
