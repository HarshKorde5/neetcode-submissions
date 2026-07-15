class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while(j < t.length()){            
            if(i < s.length() && t.charAt(j) == s.charAt(i)){
                i++;
            }
            if(i == s.length()) return true;
            j++;
        }

        return false;
    }
}