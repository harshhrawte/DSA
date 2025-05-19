import java.util.Scanner;
class temp{
  public static void main(String[] args) {
    System.out.println("Enter the temperature in celcius");
    Scanner sc=new Scanner(System.in);
    float c=sc.nextFloat();
    float k=(c*(float)(9.0/5.0)+32);
    System.out.println(k);
    sc.close();
  }
}