class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();

        backtrack(nums, new ArrayList<Integer>(), new boolean[nums.length]);

        return res;
    }

    private void backtrack(int[] nums, List<Integer> perm, boolean[] visited){
        if(perm.size() == nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }

        for(int i = 0; i < visited.length; i++){
            if(!visited[i]){
                perm.add(nums[i]);
                visited[i] = true;

                backtrack(nums, perm, visited);

                perm.removeLast();
                visited[i] = false;
            }
        }
    }
}
