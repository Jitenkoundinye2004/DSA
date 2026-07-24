class Solution {
    public int longestOnes(int[] nums, int k) {
    int low = 0;
    int zeros = 0;
    int result = Integer.MIN_VALUE;
    int n = nums.length; 
    for(int high = 0; high<n; high++){
        if(nums[high]==0){
            zeros++;
        }
        while(zeros>k){
            if(nums[low]==0){
                zeros--;
            }
            low++;
        }

        int len = high-low+1;
        result = Math.max(len,result);

    }
    return result;
    }
}