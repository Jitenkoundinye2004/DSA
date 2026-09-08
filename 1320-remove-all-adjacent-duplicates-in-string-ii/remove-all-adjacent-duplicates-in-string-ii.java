class Solution {
class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Empty stack or different character
            if (st.isEmpty() || st.peek().ch != ch) {
                st.push(new Pair(ch, 1));
            }

            // Same character
            else {
                st.peek().count++;

                // Remove when count reaches k
                if (st.peek().count == k) {
                    st.pop();
                }
            }
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            Pair p = st.pop();

            for (int i = 0; i < p.count; i++) {
                res.append(p.ch);
            }
        }

        return res.reverse().toString();
}
}