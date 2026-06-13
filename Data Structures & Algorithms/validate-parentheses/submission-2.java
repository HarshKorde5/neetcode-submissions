class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty())     return false;

                char x = stack.pop();

                System.out.println(ch+"::"+x);
                switch(ch) {
                    case ']' -> {
                        if(x != '[')    return false;
                    }
                    case '}' -> {
                        if(x != '{')    return false;
                    }
                    case ')' -> {
                        if(x != '(')    return false;
                    }
                }

            }

        }

        return true && stack.isEmpty();
    }
}
