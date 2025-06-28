package DSA191;
class Q04_kadanealgo{
public static void main(String[] args) {
     int [] nums={1,4,-2,-4,0};
    System.out.println(brute(nums, 5));
    System.out.println(optimized(nums,5));
}


//brute
static int brute(int [] nums,int l)
{
   long maxi=Integer.MIN_VALUE;
   for(int i=0;i<l;i++)
   {
    for(int j=i;j<l;j++)
    {
        int sum=0;
      for(int k=i;k<j;k++)
      {
        sum+=nums[k];
      }
    maxi=(int)Math.max(sum,maxi);
    }
   }
   return (int)maxi;
}

//optimized
static int optimized(int [] nums,int n)
{
     long maxi=Integer.MIN_VALUE;
     int sum=0;
     for(int i=0;i<nums.length;i++)
     {
        sum+=nums[i];
        if(sum>maxi)
        {
            maxi=sum;
        }
        if(sum<0)
        {
            sum=0;
        }
     }
     return (int)maxi;
}

}