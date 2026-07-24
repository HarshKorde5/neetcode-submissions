class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());


        for(int num : nums){
            List<List<Integer>> new_perms = new ArrayList<>();
            for(List<Integer> p : res){
                for(int i = 0; i <= p.size(); i++){
                    List<Integer> p_copy = new ArrayList<>(p);
                    p_copy.add(i, num);
                    new_perms.add(p_copy);
                }
            }

            res = new_perms;
        }

        return res;
    }
}
