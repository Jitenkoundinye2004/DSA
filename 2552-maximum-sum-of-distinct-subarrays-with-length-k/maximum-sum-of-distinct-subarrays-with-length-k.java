class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
          long sum = 0;
          long max = 0;
          HashMap<Integer,Integer> set = new HashMap<>();
          for(int low=0; low<k;low++){
            sum+=nums[low];
            set.put(nums[low],set.getOrDefault(nums[low],0)+1);
          }

          if(set.size()==k){
            max =sum;
          }

          for(int high = k;high<nums.length;high++){
            sum-=nums[high-k];  
            set.put(nums[high-k],set.getOrDefault(nums[high-k],0)-1);
            if(set.get(nums[high-k])==0){
                set.remove(nums[high-k]);
            }
            
            sum+=nums[high];
            set.put(nums[high],set.getOrDefault(nums[high],0)+1);
            
            if(set.size()==k){
            max = Math.max(max,sum);
            }
          }
        //   if(max==Integer.MIN_VALUE){return 0;}
          return max;
    }
}