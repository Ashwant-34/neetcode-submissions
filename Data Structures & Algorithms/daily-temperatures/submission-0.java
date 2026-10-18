class Solution {
    public int[] dailyTemperatures(int[] t) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<t.length-1; i++){
            int b=0;
            int j=i;
            int a=0;
            while(j<t.length){
                if(t[i]<t[j]){
                    break;
                }
                else{a++;
                b++;}
                j++;

                if(b==(t.length-i)){
                    a = 0;
                }

            }
            stack.push(a);
        }
        stack.push(0);
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
        

        
    }
}
