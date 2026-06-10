class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int x : nums) {
            numSet.add(x);
        }

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            
            int curr = nums[i];
            int currLen = 0;

            while(numSet.contains(curr)){
                curr++;
                currLen++;
            }

            res = res > currLen ? res : currLen;
        }

        return res;
    }
}
