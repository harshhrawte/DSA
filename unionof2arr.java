import java.util.*;
public class unionof2arr{
    public static void main(String[] args)
    {
     int [] arr1={1,2,7,9};
     int [] arr2={6,7,7,8,9};
     //better(arr1,arr2);
     //intersection(arr1,arr2);
     System.out.println(optimized(arr1, arr2));
    }


static ArrayList<Integer> optimized(int [] nums1,int [] nums2)
{
    ArrayList<Integer> union=new ArrayList<>();
    int i=0;
    int j=0;
    int m=nums1.length;
    int n=nums2.length;
    while(i<m && j<n)
    {
       if(nums1[i]<=nums2[j])
       {
         if(union.size()==0 || union.get(union.size()-1)!=nums1[i]){
            union.add(nums1[i]);
         } 
         i++;
       }
       else {
       if(union.size()==0 || union.get(union.size()-1)!=nums2[j]){
         union.add(nums2[j]);
       }
       j++;
    }
    }

    while(i<m)
    {
       if(union.get(union.size()-1) !=nums1[i])
       {
        union.add(nums1[i]);
       }
       i++;
    }
    while(j<n)
    {
     if(union.get(union.size()-1) !=nums2[j])
       {
        union.add(nums2[j]);
       }
       j++;   
    }
    return union;
}

}

    /*static int  better(int []nums1,int []nums2)
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

}*/





