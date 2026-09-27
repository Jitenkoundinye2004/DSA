class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double avg = 0;
        double maxavg =0; 
        for(int high = 0; high<k; high++){
            sum+=nums[high];
        }
        avg = sum/k;
        maxavg= avg;

        for(int i = k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg = sum/k;
            maxavg  = Math.max(maxavg, avg);
        }
        return maxavg;
    }
}