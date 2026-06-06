class Solution {
    public boolean hasDuplicate_hashset(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums){

            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }

        return false;
    }

    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[ i - 1] == nums[i]){
                return true;
            }
        }

        return false;
    }
}