class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap <Integer,Integer> f = new HashMap<>();
        int sum = 0;
        int result = 0;
        f.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int q = sum-goal;
            int freq = f.getOrDefault(q,0);
            result+=freq;
            f.put(sum,f.getOrDefault(sum,0)+1);

        }
        return result;
    }
}