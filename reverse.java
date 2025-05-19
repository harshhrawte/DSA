public class reverse {
public static void main(String[] args) {
  int num=5768;
  int a=0;
  while(num>0){
    int rem=num%10;
    num/=10;
    a=a*10+rem;
  }
  System.out.println(a);
}
}