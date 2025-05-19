import java.util.*;
public class bookallocation {
    public static void main(String[] args) {
       int [] arr={25,46,28,49,24}; 
       int result=bin(arr, 4);
       System.out.println(result);
    }
    static int bin(int [] arr,int students)
    {
        int low=Arrays.stream(arr).max().getAsInt();
        int high=Arrays.stream(arr).sum();
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(funct(arr, mid)>students)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
 static int funct(int [] arr,int pages)
 {
    int n=arr.length;
    int stupages=0;
    int student=1;
    for(int i=0;i<n;i++)
    {
        if(stupages+arr[i]<=pages)
        {
            stupages+=arr[i];
        }
        else{
            student++;
            stupages=0;
            stupages+=arr[i];
        }
    }
    return student;
 }
}
