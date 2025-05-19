public class fibrec {
  public static void main(String[] args) {
    int ans=fibo(4);
    System.out.println(ans);
//not applicable for huge numbers i.e numbers above 30 or something the program dont give answers 
//so to get answer new file created naciirec.java
  }
  static int fibo(int n){
  if(n< 2){
  return n;
}
return fibo(n-1) + fibo(n-2);
  }
}
