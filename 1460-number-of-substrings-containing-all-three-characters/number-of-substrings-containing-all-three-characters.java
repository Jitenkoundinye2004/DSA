class Solution {
    public int numberOfSubstrings(String s) {
        int n  = s.length();
        HashMap <Character,Integer> f = new HashMap<>();

        int low =0;
        int count = 0;
        for(int high=0; high<n; high++){

            f.put(s.charAt(high),f.getOrDefault(s.charAt(high),0)+1);

            while(f.size()==3){
                count+=s.length()-high;
                f.put(s.charAt(low),f.getOrDefault(s.charAt(low),0)-1);

                if(f.get(s.charAt(low))==0){
                    f.remove(s.charAt(low));
                }
                low++;
            }

        }
        return count;
    }
}