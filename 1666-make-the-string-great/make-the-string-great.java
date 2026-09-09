class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack <Character>st = new Stack<>();

        for(int i =0;i<n;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }

            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(st.peek()) && Character.isLowerCase(s.charAt(i))!= Character.isLowerCase(st.peek())){
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