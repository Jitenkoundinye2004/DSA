class Solution {

    public boolean sahi (ArrayList<Integer> have, ArrayList<Integer> need){
        for(int i =0; i<256;i++){
            if(have.get(i)<need.get(i)){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        ArrayList<Integer>have = new ArrayList<>(Collections.nCopies(256,0));
        ArrayList<Integer>need = new ArrayList<>(Collections.nCopies(256,0));
        int low = 0;
        int n = s.length();
        int m  = t.length();
        int result = Integer.MAX_VALUE;
        int start = 0;

        for(int i = 0; i<m; i++){
            need.set(t.charAt(i)-'A',need.get(t.charAt(i)-'A')+1);
        }
        for(int high = 0; high<n;high++){
            have.set(s.charAt(high)-'A',have.get(s.charAt(high)-'A')+1);

            while(sahi(have,need)){
                int len = high-low+1;
                if(result>len){
                    result=len;
                    start = low;
                }
                have.set(s.charAt(low)-'A',have.get(s.charAt(low)-'A')-1);
                low++;
            }
            
        }
        if(result==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+result);
    }

}