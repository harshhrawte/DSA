package DSA191;
public class Q01_Setmatrix0 {
    public static void main(String[] args) {
        int [][] arr = {{ 1,0,0} 
        ,{1,0,1},
        {1,1,0}};
        System.out.println("Array before set matrix 0");
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[0].length;j++)
         {
             System.out.println(arr[i][j]+ "");
         }
         System.out.println();
        }

        brute(arr);
        System.out.println("Array after set matrix 0 brute approach :");
          for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[0].length;j++)
         {
             System.out.print(arr[i][j] + "");
         }
         System.out.println();
        }

        optimized(arr);
          System.out.println("Array after set matrix 0 optimized approach:");
          for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[0].length;j++)
         {
             System.out.print(arr[i][j] + "");
         }
         System.out.println();
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
   boolean firstrow=false;
   boolean firstcol=false;
   int n=nums.length;
   int m=nums[0].length;

   //row
   for(int j=0;j<m;j++)
   {
     if(nums[0][j]==0)
     {
        firstrow=true;
     }
   }

   //column
   for(int i=0;i<n;i++)
   {
     if(nums[i][0]==0)
     {
        firstcol=true;
     }
   }

   //rest matrix 0
   for(int i=0;i<n;i++)
   {
    for(int j=0;j<m;j++)
    {
       if(nums[i][j]==0)
       {
        nums[0][j]=0;
        nums[i][0]=0;
       }
    }
   }


//set matrix
   for(int i=0;i<n;i++)
   {
    for(int j=0;j<m;j++)
    {
       if(nums[i][0]==0 || nums[0][j]==0)
       {
        nums[i][j]=0;
       }
    }
   }

   //firstrow
   if(firstrow)
   {
    for(int j=0;j<m;j++)
    {
        nums[0][j]=0;
    }
   }

   //firstcolumn
    if(firstcol)
   {
    for(int i=0;i<n;i++)
    {
        nums[i][0]=0;
    }
   }
}
}




