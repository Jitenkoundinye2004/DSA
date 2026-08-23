class Solution {
    public String removeDuplicates(String s) {
        int n  = s.length();
        Stack<Character> st= new Stack<>();

        for(int i =0;i<n;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==st.peek()){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
    
        return res.reverse().toString();
    }
}