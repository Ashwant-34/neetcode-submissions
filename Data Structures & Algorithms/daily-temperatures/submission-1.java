

class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] result = new int[n]; // Default values are already 0
        
        // Stack stores indices, not the temperatures themselves
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // While stack has a previous day colder than today's temperature
            while (!stack.isEmpty() && t[i] > t[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex; // Calculate the wait time
            }
            // Push current day's index onto the stack
            stack.push(i);
        }
        
        return result;
    }
}