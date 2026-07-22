class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low  = 0, res=0;
        HashMap<Character, Integer> f = new HashMap<>();

        for(int high = 0; high<n; high++){
            f.put(s.charAt(high), f.getOrDefault(s.charAt(high),0)+1);
            int k  = high-low+1;
            while(f.size()<k){
                f.put(s.charAt(low),f.getOrDefault(s.charAt(low),0)-1);
                if(f.get(s.charAt(low))==0){
                    f.remove(s.charAt(low));
                }
                low++;
                k=high-low+1;
            }
            int len = high-low+1;
            res = Math.max(res,len);
        }
       
        return res;
    }
}