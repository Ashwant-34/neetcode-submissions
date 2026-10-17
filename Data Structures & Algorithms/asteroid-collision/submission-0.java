class Solution {
    public int[] asteroidCollision(int[] a) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<a.length; i++){
            boolean destroy = false;
            while(!stack.isEmpty() && stack.peek()>0 && a[i]<0){
            if(Math.abs(stack.peek()) < Math.abs(a[i])){
                stack.pop();
            }
            else if(Math.abs(stack.peek()) == Math.abs(a[i])){
                destroy = true;
                stack.pop();
                break;
            }
            else{
                destroy = true;
                break;
            }}
            if(!destroy){
                stack.push(a[i]);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
        
    }
}