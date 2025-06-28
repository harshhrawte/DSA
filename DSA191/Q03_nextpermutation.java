package DSA191;
class Q03_nextpermutation{
public static void main(String[] args) {
    int [] nums={2,1,5,4,0,0};
    System.out.println("Array before the next permutation :");
    for(int i=0;i<nums.length;i++)
    { 
       System.out.println(nums[i]);
     }
     System.out.println();     
      
    optimized(nums);
    System.out.println("The next permutation :");
     for(int i=0;i<nums.length;i++)
    { 
       System.out.println(nums[i]);
     }
     System.out.println();  
}

//optimized
static void optimized(int [] nums)
{
   int n=nums.length;
   int i=n-2;
   while(i>=0 && nums[i]>=nums[i+1])
    i--;
   if(i>=0)
   {
    int j=n-1;
    while(nums[j]<=nums[i])
    {
        j--;
    }
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
   }
  reverse(nums,i+1,n-1);
}

static void reverse(int [] nums,int start,int end)
{
    while(start<end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
}
}