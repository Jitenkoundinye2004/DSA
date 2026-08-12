class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> f = new HashMap<>();
        int sum = 0;
        int result = 0;
        f.put(0,1);
        for(int i =0;i<n;i++){
            if(nums[i]%2!=0){
                sum++;
            }
            int ques = sum-k;
            int freq  = f.getOrDefault(ques,0);
            result+=freq;
            f.put(sum,f.getOrDefault(sum,0)+1);

        }
        return result;
    }
}