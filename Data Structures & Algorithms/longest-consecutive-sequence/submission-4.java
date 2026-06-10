class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int x : nums){
            numSet.add(x);
        }

        int res = 0;

        for(int x : nums){
            if(!numSet.contains(x - 1)){
                int len = 1;

                while(numSet.contains(x + len)){
                    len++;
                }

                res = len > res ? len : res;
            }

        }

        return res;
    }
}
