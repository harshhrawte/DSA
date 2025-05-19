public class zeroatlast {
    public static void main(String[] args) {
        int [] arr={1,3,0,8,0,6,0};
        int [] printnow=better(arr);
        for(int num:printnow)
        {
            System.out.println(num);
        }
        int [] optmizedvala= optimized(arr);
        for(int num:optmizedvala)
        {
            System.out.println(num);
        }
    }



//  better and brute 
    static int [] better(int [] nums)
    {
      int n=nums.length;
      int nonzeroindex=0;
      for(int i=0;i<n;i++)
      {
        if(nums[i]!=0)
        {
            nums[nonzeroindex]=nums[i];
            nonzeroindex++;
        }
      }
      for(int i=nonzeroindex;i<n;i++)
      {
        nums[i]=0;
      }
          return nums;
    }



    //optmized
    static int [] optimized(int [] nums)
    {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++)
        {
          if(nums[i]==0)
          {
            j=i;
            break;
          }
    }
    for(int i=j+1;i<n;i++)
    {
        if(nums[i]!=0)
        {
         int temp=nums[j];
         nums[i]=nums[j];
         nums[j]=temp;
         j++;
        }
    }
return nums;
}
}
