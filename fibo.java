import java.util.Scanner;
class fibonacciseries{
  void fibo()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the nth term till where you need series");
    int n=sc.nextInt();
    int a=0;
    int b=1;
    int c;
    System.out.println(a+" "+b);
    for(int i=1;i<=n;i++)
    {
    c=a+b;
    System.out.println(c);
    a=b;
    b=c;
    }
    System.out.println("");
    sc.close();
  }
}
class fibonacci{
public static void main(String[] args) {
  fibonacciseries obj=new  fibonacciseries();
  obj.fibo();
}
}