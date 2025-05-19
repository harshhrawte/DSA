public class nto1 {
  public static void main(String[] args) {
    xyz(5);
  }
  static void xyz(int n){
    if(n==0){
    return ;
    }
    System.out.println(n);
   xyz(n-1);
   System.out.println(n);
  }
}
/*to print 12345 write first funct and then sop 
  to print 54321 write first sop then do funct call
  to pritn 5432112345 write sop funct sop
 */
