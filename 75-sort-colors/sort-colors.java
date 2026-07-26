class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;  
        int right = n-1;
        int mid = 0;

        while(mid<=right){
            if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;
            }else if (nums[mid]==0){
                int temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }else{
                mid++;
            }
        }

         
    }
}