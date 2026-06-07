class Solution {
    private Map<String,List<String>> map = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {

        for(String x : strs){
            char[] charArray = x.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            // System.out.println(key);

            map.computeIfAbsent(key, k -> new ArrayList<String>()).add(x);
        }

        // System.out.println(map);
        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }
}
