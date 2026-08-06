class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top = stk.pop();
                int newTop = stk.peek() + top;
                stk.push(top);
                stk.push(newTop);
            }else if(op.equals("C")){
                stk.pop();
            }else if(op.equals("D")){
                stk.push(2*stk.peek());
            }else{
                stk.push(Integer.parseInt(op));
            }

        }
        int res = 0;
        for(int sc : stk){
            res = res + sc;
        }
        return res;
    }
}