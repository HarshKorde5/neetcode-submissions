class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int x : nums) {
            numSet.add(x);
        }

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int search = nums[i];
            List<Integer> temp = new ArrayList<>();
            temp.add(search);
            search++;

            while (numSet.contains(search)) {
                temp.add(search);
                search++;
            }

            res = res > temp.size() ? res : temp.size();
        }

        return res;
    }
}
