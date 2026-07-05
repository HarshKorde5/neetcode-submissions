class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int freq = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == val){
                freq++;
            }else{
                freq--;
                if(freq < 1){
                    val = nums[i];
                    freq = 1;
                }
            }
        }

        return val;
    }
}