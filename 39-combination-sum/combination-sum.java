class Solution {
    static void solve(int[] candidates, int target,int index,List<Integer> res,List<List<Integer>> ans){
        if(target==0){
            
             ans.add(new ArrayList(res));
             return;
        }
        if(index >=candidates.length){
        return ;
    }

    if(target<0){
        return ;
    }

    //include case(\
        res.add(candidates[index]);
        solve(candidates,target-candidates[index],index,res,ans);
        //exclude case using backtracking
        res.remove(res.size()-1);
        solve(candidates,target,index+1,res, ans);}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int index = 0;
        solve(candidates,target,index,res,ans);
        return ans; 
    }
}