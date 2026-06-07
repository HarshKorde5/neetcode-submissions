class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>()   ;

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);            
        }

        
        int[] result = map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();


        return result;
    }
}
