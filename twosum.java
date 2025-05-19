import java.util.Arrays;
import java.util.*;
public class twosum {
 public static void main(String[] args) {
    int []arr={2,4,6,7,8};
    brute(arr,15);
    better(arr,15);
 }   


 //brute 
 static int[] brute(int [] nums,int target)
 {
    int [] pqr=new int[2];
    for(int i=0;i<nums.length;i++)
    {
        pqr[0]=i;
        for(int j=i+1;j<nums.length;j++)
        {
        if(target==nums[i]+nums[j])
        {
            pqr[1]=j;
            System.out.println(Arrays.toString(pqr));
            return pqr;
        }
        }
    }
    System.out.println(Arrays.toString(pqr));
    return pqr;
    
 }


//better
static int [] better(int [] nums,int target)
{
    int n=nums.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {  
      int num=nums[i];
      int moreneeded=target-num;
      if(map.containsKey(moreneeded))
      {
        int [] result= {map.get(moreneeded),i};
       System.out.println(Arrays.toString(result));
        return result;
      }
      map.put(nums[i],i);
    }
    return new int[]{-1,-1};
}


//optimzed
//leave it coz even hashmap is good and other approach is two pointer
}
