class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int n = s.length();
        int start = 0, end = 0;

        HashSet<Character> charSet = new HashSet<>();
        for(char ch : s.toCharArray()){
            charSet.add(ch);
        }

        for(char ch : charSet){
            int count = 0;
            int left = 0, right = 0;
            while(right < n){
                if(s.charAt(right) == ch){
                    count++;
                }

                while((right - left + 1) - count > k){
                    if(s.charAt(left) == ch)    count--;
                    left++;
                }

                res = Math.max(res, right - left + 1);
                right++;
            }
        }

        return res;

    }
}
