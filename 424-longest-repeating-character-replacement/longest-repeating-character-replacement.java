class Solution {

    public int find(ArrayList<Integer> freq){
        int max = -1;
        for(int i =0 ;i <256; i++){
            max=Math.max(max,freq.get(i));
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
       int n = s.length();
       int low = 0;
       int result = Integer.MIN_VALUE;
       ArrayList<Integer> f = new ArrayList<>();
       for(int i  =0;i<256; i++){
        f.add(0);
       }
       for(int high = 0;high<n; high++){
        f.set(s.charAt(high)-'A',f.get(s.charAt(high)-'A')+1);
        int len = high-low+1;
        int max = find(f);
        int diff = len-max;
        while(diff>k){
            f.set(s.charAt(low)-'A', f.get(s.charAt(low)-'A') - 1);
            low++;
            len = high-low+1;
            max = find(f);
            diff = len-max;
        }

        len = high-low+1;
        result = Math.max(result,len);
       }
       return result;
    }
}