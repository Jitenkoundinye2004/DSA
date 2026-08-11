class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int ones = 0;
        int result = 0;
        HashMap <Integer,Integer> f = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                ones++;
            }
            int diff = zero-ones;

            if(diff==0){
                result = Math.max(result,i+1);
                continue;
            }
            if(f.containsKey(diff)){
                int idx = f.getOrDefault(diff,0);
                int len = i-idx;
                result=Math.max(result,len);
            }else{
                f.put(diff,f.getOrDefault(diff,0)+i);
            }
        }
        return result;
    }
}