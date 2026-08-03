class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int maxending = nums[i];
        int minending = nums[i];
        int res = nums[i];
        int n  = nums.length;
        for(i =1; i<n;i++){
            int v1 = nums[i];
            int v2 = nums[i]*maxending;
            int v3 = nums[i]*minending;

            maxending = Math.max(v1,Math.max(v2,v3));
            minending = Math.min(v1,Math.min(v2,v3));
            res = Math.max(res,maxending);
        }
        return res;
    }
}