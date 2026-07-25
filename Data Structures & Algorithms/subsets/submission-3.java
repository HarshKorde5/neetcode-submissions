class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        dfs(nums,new ArrayList<Integer>(),0);
        return res;
    }

    private void dfs(int[] nums, List<Integer> sub,int curridx){
        if(curridx == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }


        sub.add(nums[curridx]);
        dfs(nums,sub,curridx+1);
        sub.removeLast();
        dfs(nums,sub,curridx+1);
    }
}
