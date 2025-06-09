public class secondlargestele {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        brute(arr);
        optimized(arr);
        moreoptimized(arr);
    }


//brute
    static int brute(int [] nums)
    {
        int n=nums.length;
        int secondlargest=-1;
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
        int largest=nums[n-1];
        for(int i=n-2;i>0;i--)
        {
            if(nums[i]!=largest)
            {
                secondlargest=nums[i];
                break;
            }
        }
         System.out.println(secondlargest);
         return secondlargest;
    }




 //better 
 static int optimized(int [] numu)
 {
    int largest=numu[0];
    int n=numu.length;
    int secondlargest=-1;
    for(int i=1;i<n;i++)
    {
    if(numu[i]>largest)
    {
      largest=numu[i];
    }
    }
    for(int i=0;i<n;i++)
    {
        if(numu[i]>secondlargest && numu[i]!=largest)
        {
            secondlargest=numu[i];
        }
    }
    System.out.println(secondlargest);
    return secondlargest;
 }



 

 //optimized
 static int moreoptimized(int []numpy)
 {
   int largest=numpy[0];
   int secondlargest=-1;
   int n=numpy.length;
   for(int i=0;i<n;i++)
   {
    if(numpy[i]>largest)
    {
     secondlargest=largest;
     largest=numpy[i];
    }
    else if(numpy[i]<largest && secondlargest<numpy[i])
    {

     secondlargest=numpy[i];
    }
   }  
  System.out.println(secondlargest);
    return secondlargest;
 }
}