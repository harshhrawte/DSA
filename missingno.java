public class missingno {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,6};
        optimized(arr);
        System.out.println(brute(arr));
    }

    //brute
    static int brute(int [] nums)
    {
        int n=nums.length;
        int flag;
        for(int i=0;i<n;i++)
        {
            flag=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]==i)
                {
                 flag=1;
                }
            }
            if(flag==0)
            {
                return i;
            }
        }
        return -1;
    }


    //optimized

    public static int optimized(int [] numpyy)
    {   int n=numpyy.length;
        for(int i=0;i<numpyy.length;i++)
        {
         n+=i-numpyy[i];
        }
        System.out.println(n);
        return n;
    }
}
