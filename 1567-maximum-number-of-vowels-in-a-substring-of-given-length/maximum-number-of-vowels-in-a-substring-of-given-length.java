class Solution {
    public boolean isVowel(char ch){
        return ch == 'a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int n  = s.length();
        // int result  = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int result =count;

        for(int i = k; i<n;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            result = Math.max(result,count);
        }
            

        return result;
    }
}