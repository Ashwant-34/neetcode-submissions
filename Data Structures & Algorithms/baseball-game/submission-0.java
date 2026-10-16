class Solution {
    public int calPoints(String[] o) {
        Deque<Integer> stack = new ArrayDeque<>();
        int a;
        int b;
        int x;

        for(int i=0;i<o.length;i++){

            if(o[i].equals("+")){
                a = stack.pop();
                b = stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else if(o[i].equals("C")){
                stack.pop();
            }
            else if(o[i].equals("D")){
                x = 2*stack.peek();
                stack.push(x);
            }
            else{
                stack.push(Integer.parseInt(o[i]));
            }
        }
        int y = 0;
        for(int i : stack){
            y += i;
        }
        return y;
        
    }
}