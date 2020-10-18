class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[2*n];
        int t=0;
        for(int i=0; i<nums.length;i++)
        {
            if(i%2==0)
            {
                result[i]= nums[t];
                t = t+1;
            }
            else
            {
                if(t<2*n)
                result[i] = nums[t+n-1];
            }
        }
        return result;
    }
}
