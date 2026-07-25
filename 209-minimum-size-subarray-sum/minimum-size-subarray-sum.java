class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int low = 0;
        int n = nums.length;
        int sum = 0;
        for(int high = 0; high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                int len = high-low+1;
                result= Math.min(result,len);
                sum-=nums[low];
                low++;
            }
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}