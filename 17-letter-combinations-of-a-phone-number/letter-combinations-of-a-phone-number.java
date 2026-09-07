class Solution {
    static void sol(String digits,int index,String[] mapping,List<String> res,StringBuilder output){
        if(index >=digits.length()){
            res.add(output.toString());
            return ;
        }

     int value = digits.charAt(index)-'0';
     String mappedString= mapping[value];

     for(int i =0;i<mappedString.length();i++){
        output.append(mappedString.charAt(i));
        sol(digits,index+1,mapping,res,output);
        output.deleteCharAt(output.length()-1);
     }    
    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();//store string 
        int index =0;
        StringBuilder output = new StringBuilder();//create string 
        sol( digits,index, mapping,res,output);
        return res;
    }
}