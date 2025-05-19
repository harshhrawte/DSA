public class leftrotatebyd {
    public static void main(String[] args) {
       int [] arr={1,45,6,7,8,7};
       int [] printed=brute(arr,3);
       for(int num:printed)
       {
        System.out.println(num);
       }
    }

//brute

    static int [] brute(int [] nums,int d)
    {
      int n=nums.length;
      int [] temp=new int[d];
        for (int i = 0; i < d; i++) {
            temp[i]=nums[i]; 
        }
   for(int i=d;i<n;i++)
   {
    nums[i-d]=nums[i];
   }
     int j=0;
   for(int i=n-d;i<n;i++)
   {
    nums[i]=temp[j++];
   }
      return nums;
    }
}

