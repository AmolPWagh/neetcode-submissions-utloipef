class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stk = new Stack<>();

        for (String i : operations){

            if (i.equals("+")){
                int top = stk.pop();
                int newTop = top + stk.peek();
                stk.push(top);
                stk.push(newTop);
            }
            else if (i.equals("D")){
                stk.push(2*stk.peek());
            }
            else if (i.equals("C")){
                stk.pop();
            }
            else{
                stk.push(Integer.parseInt(i));
            }
        }
        int sum = 0;
        for (int s : stk){
            sum = sum + s;
        }
        return sum;
    }
}