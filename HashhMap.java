import java.util.*;
public class HashhMap {
    public static void main(String[] args) {
      int [] arr={1,3,2,5,1,3,1,5,1};
      optimized(arr);
    }
    static void optimized(int [] nums)
    {  int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
             if(map.containsKey(nums[i]))
             {
                map.put(nums[i],map.get(nums[i])+1);
             }
             else{
                map.put(nums[i],1);
             }
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>n/3)
            {
                System.out.println(key);
            }
        }
    }
}
