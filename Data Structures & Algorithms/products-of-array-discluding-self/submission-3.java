class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int res[] = new int[n];

        res[0] = 1;


        //same way build the prefix directly in result array.
        for(int i = 1; i < n; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }


        //instead of taking separate array for postfix, take single variable and update it as required.
        int x = 1;
        for(int i = n - 1; i >= 0; i--){
            res[i] *= x;
            x *= nums[i];
        }

        return res;
    }
}  
