class Solution {
    public String decodeString(String s) {
         Stack<Integer> count = new Stack<>();
        Stack<String> Str = new Stack<>();

        int num = 0;
        String current = "";
        for(int ch =0;ch<s.length();ch++){
            if(Character.isDigit(s.charAt(ch))){
                num = num*10+(s.charAt(ch) - '0');
            }else if(s.charAt(ch)=='['){
                count.push(num);
                Str.push(current);

                num=0;
                current="";
            }else if(s.charAt(ch)!=']'){
                current += s.charAt(ch);
            }else{
                int c = count.pop();
                String previous = Str.pop();

                StringBuilder temp = new StringBuilder(previous);

                for(int i = 0; i<c; i++){
                    temp.append(current);
                }

                current= temp.toString();
            }
        } 
        return current;
    }
}