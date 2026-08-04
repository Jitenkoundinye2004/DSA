class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int i =0;
        int maxending = nums[i];
        int minending = nums[i];
        int result = nums[i];
        int n  = nums.length;
        for(i=1;i<n;i++){
            int v1 = nums[i];
            int v2 = maxending+nums[i];
            int v3 = minending+nums[i];
            maxending = Math.max(v1,v2);
            minending = Math.min(v1,v3);
            result = Math.max(Math.abs(result),Math.max(Math.abs(maxending),Math.abs(minending)));
        }
        return Math.abs(result);
    }
}