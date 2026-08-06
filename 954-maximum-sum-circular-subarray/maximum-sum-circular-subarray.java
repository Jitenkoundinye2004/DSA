class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int i = 0;
        int bestmaxsum = nums[i];
        int maxsum=nums[i];
        int bestminsum = nums[i];
        int minsum = nums[i];
        int result = nums[i];

        int total = nums[i];
        for(i = 1; i<nums.length ; i++){
            total+=nums[i];
            bestmaxsum = Math.max(nums[i],bestmaxsum+nums[i]);
            maxsum = Math.max(bestmaxsum,maxsum);
            bestminsum = Math.min(nums[i],bestminsum+nums[i]);
            minsum = Math.min(minsum,bestminsum);
            
        }
        if(maxsum<0){return maxsum;}
        return Math.max(maxsum,total-minsum);
    }
}