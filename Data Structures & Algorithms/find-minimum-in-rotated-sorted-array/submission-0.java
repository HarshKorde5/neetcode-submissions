class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        int i = 1;

        while(i < n && nums[i - 1] < nums[i])   i++;

        if(i == n)  return min;

        return nums[i];
    }
}
