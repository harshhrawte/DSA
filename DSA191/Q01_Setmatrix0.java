package DSA191;
public class Q01_Setmatrix0 {
    public static void main(String[] args) {
        int [][] arr = {{ 1,0,0} ,{1,0,1},{1,1,0}};
        System.out.println("Array before set matrix 0");
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[0].length;j++)
         {
             System.out.println(arr[i][j]+ "");
         }
        }
        brute(arr);
        System.out.println("Array after set matrix 0");
          for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[0].length;j++)
         {
             System.out.print(arr[i][j] + "");
         }
        }
    }


//brute
static void brute(int [] [] nums)
{
    int n=nums.length;
    int m=nums[0].length;
    int [] row=new int[n];
    int [] col=new int[m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
          if(nums[i][j]==0)
          {
            row[i]=1;
            col[j]=1;
          }
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(row[i]==1 || col[j]==1)
            {
              nums[i][j]=0;
            }
        }
    }
}


//optimized
static void optimized(int [] [] nums)
{
   
}
}

