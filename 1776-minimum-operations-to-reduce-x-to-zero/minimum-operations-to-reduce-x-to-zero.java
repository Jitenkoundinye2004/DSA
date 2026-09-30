class Solution {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        int low = 0;
        int result = -1;
        int sum = 0;
        int totalsum=0;

        for(int i =0;i<n;i++){
            totalsum+=nums[i];
        }
        int target = totalsum-x;
        for(int high = 0; high<n;high++){
            sum+=nums[high];
            while(sum>target && low<=high){
                sum-=nums[low];
                low++;
                
            }
            if(sum==target){
                int len = high-low+1;
                result=Math.max(result,len);
            }
        }
        if(result==-1){
                return -1;
            }
        return n-result;  
    }
}