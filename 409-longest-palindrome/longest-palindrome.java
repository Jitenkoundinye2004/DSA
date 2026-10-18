class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        int result = 0;
        boolean odd = false;

        for(int i =0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val%2==0){
                result+=val;
            }else{
                odd=true;
            }
        }
        if(odd==false){
            return result;
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            int val = entry.getValue();
            if(val%2==1){
                result+=val-1;
            }
        }

        return  result+1;
    }
}