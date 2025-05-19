public class longestsubarraywithsumk {
    public static void main(String[] args) {
       int [] nums={1,2,3,1,1,1,1,4,2,3};
       System.out.println(brute(nums,3));
       better(nums,5);
    }

    //brute
    static int brute(int [] arr,int k)
    {
     int length=0;
     int n=arr.length;
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            int sum=0;
            for(int p=i;p<=j;p++ )
            {
                sum+=arr[p];
            }
            if(sum==k)
            {
                length=Math.max(length,j-i+1);
            }
        }
    }
     return length;
    }

    //better
  static int better(int [] numu,int k)
  {
    int length=0;
    int n=numu.length;
    for(int i=0;i<n;i++)
    {   int sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=numu[j];

        if(sum==k)
        {
        length=Math.max(length,j-i+1);
        }}
    }
    System.out.println(length);
    return length;
  }



  //optimized
  static int optimized(int [] nums )
  {
    int n=nums.length;
    
    return n;
  }

  
}
