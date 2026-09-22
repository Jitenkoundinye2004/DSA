class Solution {
    public int trap(int[] height) {
        int n  = height.length;
        int i = 0;
        int j= n-1;
        int imax = 0;
        int jmax = 0;
        int res = 0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>=imax){
                    imax= height[i];
                }
                res += imax-height[i];
                i++;
            }else{
                if(height[j]>=jmax){
                    jmax = height[j];
                }
                res += jmax-height[j];
                j--;
            }
            
        } 
        return res;
    }
}