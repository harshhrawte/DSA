public class leftrotateby1 {
 public static void main(String[] args) {
  int [] arr={1,4,3,56,5};
  int[] result = brute(arr);
  for (int num : result) {
      System.out.print(num + " ");
  }
 }

 
 static int [] brute(int [] nums)
 {
   int temp=nums[0];
   int n=nums.length;
   for(int i=1;i<n;i++)
   {
    nums[i-1]=nums[i];
   }
   nums[n-1]=temp;

    return nums;
 }   
}
