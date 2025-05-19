import java.util.*;
public class booquet {
    public static void main(String[] args) {
       int [] bloomDay={7,7,7,7,13,11,10,12};
       int result=binarysearch(bloomDay, 2, 3);
       System.out.println(result);
    }
    static int binarysearch(int [] bloomDay,int m,int k)
    {
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int n=bloomDay.length;
        if (n < (long)m * k) {
            return -1;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(bloomDay, mid,m, k))
            {
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    static boolean possible(int [] bloomDay,int Day,int m,int k)
    {
      int count=0;
      int noofbloom=0;
      int n=bloomDay.length;
      for(int i=0;i<n;i++)
      {
        if(bloomDay[i]<=Day)
        {
            count++;
            if(count==k)
            {
                noofbloom++;
                count=0;
            }
        }
        else{
            count=0;
        }
        if(noofbloom>=m)
        {
            return true;
        }
      }
      return false;
    }
}
