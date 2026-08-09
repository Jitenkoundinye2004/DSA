class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int n =nums.length;
        int product =1;
        int result = 0;
        for(int right = 0;right<n;right++){
            product*=nums[right];
            while(product>=k && left<=right){
                product/=nums[left];
                left++;
            }
            result+= right-left+1;   
        }
        return result;
    }
}