
public class removedup {
    public static void main(String[] args) {
        int [] arr={1,1,1,1,12,45,67};
        optimal(arr);

    }
    static int optimal(int [] nums)
        {
            int n=nums.length;
            int j=1;
            for(int i=1;i<n;i++)
            {
                if(nums[i]!=nums[i-1])
                {
                      nums[j]=nums[i];
                      j++;
                }
            }
            System.out.println(j);
            return j;
        }
}
