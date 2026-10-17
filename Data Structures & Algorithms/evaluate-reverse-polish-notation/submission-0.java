class Solution {
    public int evalRPN(String[] t) {
        int a;int b;
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<t.length; i++){
            if(t[i].equals("+")){
                a = stack.pop();
                b = stack.pop();
                stack.push(a+b);
            }
            else if(t[i].equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b-a);
            }
            else if(t[i].equals("*")){
                a = stack.pop();
                b = stack.pop();
                stack.push(a*b);
            }
            else if(t[i].equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(t[i]));
            }
        }
        return stack.peek();
    }
}
