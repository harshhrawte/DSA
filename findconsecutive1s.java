public class findconsecutive1s {
    public static void main(String[] args) {
        int [] arr={1,0,1,1,1,1,0,0,1};
        consecutive(arr);
    }
    static int consecutive(int [] nums)
    {  int max=0;
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==1)
        {
            count++;
            max=Math.max(max,count);
        }
        else{
            count=0;
        }
       }
       System.out.println(max);
        return max;
    }
}
