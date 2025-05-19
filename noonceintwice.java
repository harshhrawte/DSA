public class noonceintwice {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3,4,4};
        optimzed(arr);
        System.out.println(brute(arr));
    }
    
//brute
    static int brute(int [] numpy)
    {
        int counter=0;
        int n=numpy.length;
        for(int i=0;i<n;i++)
        {
            int accu=numpy[i];
            counter=0;
            for(int j=0;j<n;j++)
            {
               if(numpy[j]==accu)
               {
                counter++;
               }
            }
            if(counter==1)
            {
                return accu;
            }
         }
     System.out.println(counter);
      return counter;
    }


//by XOR operation
    //ans should be 2
    static int optimzed(int [] nums)
    {
      int res=0;
      for(int num:nums)
      {
        res^=num;
      }
      System.out.println(res);
      return res;
    }
}
