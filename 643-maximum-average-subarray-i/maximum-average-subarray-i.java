class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum+=nums[i];
        }
        double max = sum;
        for(int high = k; high<n;high++){
            sum+=nums[high];
            sum-=nums[high-k];

            max = Math.max(max,sum);
        }
        return (double)max/k;
    }
}