package DSA191;
public class Q06_buysellstocks {
    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        for(int i:nums)
        {
            System.out.println(i);
        }
        System.out.println("The max profit is : ");
     System.out.println(optimized(nums));

    }

    //optimized
    static int optimized(int [] prices)
    {
      int buyprice=prices[0];
      int profit=0;
      for(int i=0;i<prices.length;i++)
      {
         if(buyprice>prices[i])
         {
            buyprice=prices[i];
         }
         profit=Math.max(profit,prices[i]-buyprice);
      }
   return profit;
    }
}
