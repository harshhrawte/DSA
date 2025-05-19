import java.util.Arrays;
public class aggresivecows {
    public static void main(String[] args) {
        int [] arr={0,3,4,7,9,10};
        Arrays.sort(arr);
        int result=binarysearch(arr,4);
        System.out.println(result);
    }
    static int binarysearch(int [] arr, int cows)
    {
        int low=1;
        int n=arr.length;
        int high=arr[n-1]-arr[0];
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(arr,mid,cows))
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    static boolean possible(int [] arr,int dist,int Cows)
    {
        int cows=1;
        int lastcow=arr[0];
       for(int i=1;i<arr.length;i++)
       {
         if(arr[i]-lastcow >=dist)
         {
            cows++;  
            lastcow=arr[i];
         }
         if(cows==Cows)
         {
            return true;
         }
       }
       return false;
    }
}
