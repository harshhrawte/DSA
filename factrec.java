import java.util.Scanner;
public class factrec {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter n");
    int n=sc.nextInt();
   int ans=fact(n) ;
   System.out.println(ans);
   sc.close();
  }
  static int fact(int n){
  if(n<=1){
    return 1;
  }
  return n*fact(n-1);
  }
}

/*to print sum of n=5 nos just put + insetead of * */