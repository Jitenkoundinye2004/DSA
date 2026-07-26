class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int left = 0;
        int n = word1.length();
        int m = word2.length();
        int right = 0;
        while(left<n && right<m){
            str.append(word1.charAt(left));
            str.append(word2.charAt(right));
            left++;
            right++;
        }

        while(left<n){
            str.append(word1.charAt(left));
            left++;
        }
        while(right<m){
            str.append(word2.charAt(right));
            right++;
        }

        
        return str.toString();
    }
}