class Solution {
    static void solve(int[] candidates, int target,int index,List<Integer> res,List<List<Integer>> ans,int count,int k){
       if(count>k){
        return;
       }

        if(count==k&&target==0){
            
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
        solve(candidates,target-candidates[index],index+1,res,ans,count+1,k);
        //exclude case using backtracking
        
        res.remove(res.size()-1);
        while(index+1<candidates.length&&candidates[index]==candidates[index+1]){
            index++;
        }
        solve(candidates,target,index+1,res, ans,count,k);
        }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int index = 0;
        int target = n;
        int[] candidates={1,2,3,4,5,6,7,8,9};
        int count =0;

        solve(candidates,target,index,res,ans,count ,k);
        return ans; 

        
    }
}