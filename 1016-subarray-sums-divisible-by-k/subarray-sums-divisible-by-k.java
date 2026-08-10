class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> f = new HashMap<>();
        int sum = 0;
        int result =0;
        
        f.put(0,1);
        for(int i = 0;i<nums.length;i++){
            sum +=nums[i];
            int rem = sum%k;
            if(rem<0){
                rem=rem+k;
            }
            int freq = f.getOrDefault(rem,0);
            result+=freq;
            f.put(rem,f.getOrDefault(rem,0)+1);
        }
        return result;
    }
}