import java.util.*;
public class unionof2arr{
    public static void main(String[] args)
    {
     int [] arr1={7,6,9,1};
     int [] arr2={1,7,5,6,9};
     optimized(arr1,arr2);
     intersection(arr1,arr2);
    }

    static int  optimized(int []nums1,int []nums2)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            set.add(nums2[j]);
        }
        System.out.println(set.size());
        System.out.println(set);
        return set.size();
    }

 
    static int intersection(int [] nums1,int []nums2)
    {
        int count =0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j]))
            {
               count++;
               set.remove(nums2[j]);
            }
        }
        System.out.println(count);
        return count;
    }

}