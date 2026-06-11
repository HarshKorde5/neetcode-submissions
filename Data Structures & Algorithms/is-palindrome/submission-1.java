class Solution {
    private boolean isAlphaNumeric(char ch){
        if(ch >= 'a' && ch <= 'z')  return true;
        if(ch >= 'A' && ch <= 'Z')  return true;
        if(ch >= '0' && ch <= '9')  return true;

        return false;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while(i < j){
            
            while(i < j && !isAlphaNumeric(s.charAt(i))){
                i++;
            }

            while(j > i && !isAlphaNumeric(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
