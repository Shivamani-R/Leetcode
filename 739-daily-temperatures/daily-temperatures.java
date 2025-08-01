class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();  
        int[] result = new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek() - i;
            } else {
                result[i] = 0;
            }
            stack.push(i);
        }
        
        return result;
    }
}
