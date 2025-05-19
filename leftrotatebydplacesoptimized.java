public class leftrotatebydplacesoptimized {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,56,67,7};
        int k=3;
        int n=7;
        reverse(arr,k,n);
        for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void reversefunc(int [] nums,int start,int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    static void reverse(int [] nums,int k,int n)
    {
         reversefunc(nums,0,n-k-1);
         reversefunc(nums,n-k,n-1);
         reversefunc(nums,0,n-1);
    }
}



  