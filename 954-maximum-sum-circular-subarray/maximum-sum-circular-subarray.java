class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int i =0;
        int currmax = nums[i];
        int maxsum = nums[i];

        int currmin = nums[i];
        int minsum = nums[i];
        
        int total = nums[i];
        int n = nums.length;
        for(i=1; i<n;i++){
            currmax = Math.max(nums[i],currmax+nums[i]);
            maxsum = Math.max(currmax,maxsum);

            currmin = Math.min(nums[i],currmin+nums[i]);
            minsum = Math.min(minsum,currmin);

            total+=nums[i];
        }

        if(maxsum<0){
            return maxsum;
        }

        return Math.max(maxsum,total-minsum);
    }
}