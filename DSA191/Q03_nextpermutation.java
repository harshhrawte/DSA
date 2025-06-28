package DSA191;
class Q03_nextpermutation{
public static void main(String[] args) {
    int [] nums={2,1,5,4,0,0};
    System.out.println("Array before the next permutation :");
    for(int i=0;i<nums.length;i++)
    { 
       System.out.println(nums[i]);
        }       
}

//brute
static int brute(int [] nums)
{
    int result=0;

    return result;
}

//optimized
static int optimized(int [] nums)
{
    int result=0;

    return result;
}

private void reverse(int [] nums,int start,int end)
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