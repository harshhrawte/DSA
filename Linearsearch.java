public class Linearsearch {
  public static void main(String[] args) {
    int []arr={1,2,3,4,5,56,67,6,14,32};
    int target=4;
    int ans=linearsearch(arr, target);
    System.out.println(ans);
  }
  
  static int linearsearch(int []arr,int target){
   if(arr.length==0){
    return -1;
   }
   for(int i=0;i<=arr.length;i++){
    int element=arr[i];
    if(element==target)
    return i;
   }
  return -1;
  }
}
