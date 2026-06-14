class Solution {
    public int[] dailyTemperatures(int[] T) {
        Deque<int[]> stack = new ArrayDeque<>();

        int res[] = new int[T.length];

        for(int i = 0; i < T.length; i++){

            while(!stack.isEmpty() && T[i] > stack.peek()[0]){
                int[] pair = stack.pop();

                res[pair[1]] = i - pair[1];
            }

            stack.push(new int[]{T[i], i});
        }

        return res;
    }
}
