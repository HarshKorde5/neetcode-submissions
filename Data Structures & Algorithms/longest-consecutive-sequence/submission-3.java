class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int req = nums[0], res = 0, currLen = 0, i = 0;

        while (i < nums.length) {
            if (req != nums[i]) {
                req = nums[i];
                currLen = 0;
            }

            while (i < nums.length && nums[i] == req) {
                i++;
            }

            currLen++;
            req++;

            res = Math.max(currLen, res);
        }

        return res;
    }
}
