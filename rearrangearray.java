import java.util.Arrays;

public class rearrangearray {
    public static void main(String[] args) {
       int [] arr={3,2,-1,-5,6,-8};
       int[] rearranged = brute(arr);
        System.out.println(Arrays.toString(rearranged));
    }

    //brute
    static int [] brute(int [] nums)
    {
     int n=nums.length;
     int [] positive=new int[n/2];
     int [] negative=new int[n/2];
  int pos=0,neg=0;
     for(int i:nums)
     {
        if(i>0)
        {
              positive[pos++]=i;
        }
        else{
            negative[neg++]=i;
        }
     }
     for(int j=0;j<n/2;j++)
     {
        nums[2*j]=positive[j];
        nums[2*j+1]=negative[j];
     }
     return nums;
    }
}
