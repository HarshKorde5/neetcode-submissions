class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        backtrack(0,0,n,curr);
        return res;
    }

    private void backtrack(int open,int close,int n,StringBuilder curr){
        if(open == close && open == n){
            res.add(curr.toString());
            return;
        }

        if(open < n){
            curr.append('(');
            backtrack(open + 1, close, n, curr);
            curr.deleteCharAt(curr.length()-1);
        }

        if(close < open){
            curr.append(')');
            backtrack(open,close+1,n,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
