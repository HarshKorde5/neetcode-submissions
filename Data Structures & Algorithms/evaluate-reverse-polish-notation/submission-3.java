class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String str : tokens) {
            if (str.length() > 1 || Character.isDigit(str.charAt(0))) {
                stack.push(Integer.parseInt(str));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (str) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
