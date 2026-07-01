class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int n = s.length();

        int start = 0, end = 0;
        Map<Character,Integer> map = new HashMap<>();
        int maxFreq = 0;

        while(end < n){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(end)));

            while((end - start + 1) - maxFreq > k){
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                start++;
            }

            res = Math.max(res, end - start + 1);
            end++;
        }

        return res;
    }
}
