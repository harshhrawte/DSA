public class largest{
    public static void main(String[] args) {
        int [] arr ={2,3,56,78};
        brute(arr);
        optimize(arr);
    }

static int brute(int [] nums)
{
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        for (int j=0;j<n-i-1;j++)
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


static int optimize(int [] numu)
{
    int n=numu.length;
    int largest=numu[0];
    for(int i=0;i<n;i++)
    {
        if(numu[i]>largest){
            largest=numu[i];
        }
    }
    System.out.println(largest);
     return largest;
}
}