class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();
        
        if (s.length()%2!=0) return false;
        else{
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                    stk.push(s.charAt(i));
                }
                else if (!stk.isEmpty() && s.charAt(i) == '}' && stk.peek()=='{'){
                    stk.pop();
                }
                else if (!stk.isEmpty() && s.charAt(i) == ']' && stk.peek()=='['){
                    stk.pop();
                }
                else if (!stk.isEmpty() && s.charAt(i) == ')' && stk.peek()=='('){
                    stk.pop();
                }
                else return false;
            }
            
            return stk.isEmpty();
        }
    }
}
