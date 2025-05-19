public class kadanealgo {
    public static void main(String[] args) {
        int [] arr={1,4,-2,-4,0};
        kadanebrute(arr,5);
        kadaneoptimize(arr,5);
    }

//kadanes brute force approach 
  static int kadanebrute(int []nums,int n){
    long maxi=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<j;k++)
                {
                   sum+=nums[k];
                }
                maxi=Math.max(sum,maxi);
            }
        }
        System.out.println(maxi);
        return (int)maxi;
 }


 //kadanes optimized solution 
 static int kadaneoptimize(int[] num,int l){
    long maxi=Long.MIN_VALUE;
    long sum=0;
    for(int i=0;i<l;i++)
    {
        sum+=num[i];
        if(sum>maxi)
        {
            maxi=sum;
        }
        if(sum<0)
        {
            sum=0;
        }
    }
    System.out.println(maxi);
     return (int)maxi; 
 }
}
