class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;

        while(start < end){
            int mid = (start + end) / 2;

            if(nums[mid] == target) return mid;

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }


        int pivot = start;
        start = 0;
        end = n - 1;

        if(target >= nums[pivot] && target <= nums[end]){
            start = pivot;
        }else{
            end = pivot - 1;
        }

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
