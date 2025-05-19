public class largestele {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,0};
        largest_brute(arr);
        largestoptimize(arr);
    }


    //brute
static int largest_brute(int []nums)
{
    int n=nums.length;
   for(int i=0;i<n;i++)
   {
    for(int j=0;j<n-i-1;j++)
    {
        if(nums[j]>nums[j+1])
        {
            int temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
        }
    }
   }
   System.out.println(nums[n-1]);
   return nums[n-1];
}


//optimize
static int largestoptimize(int [] numu)
{
    int largest=numu[0];
    for(int i=0;i<numu.length;i++)
    {
        if(numu[i]>largest){
          largest=numu[i];
        }
    }
    System.out.println(largest);
    return largest;
}

}

