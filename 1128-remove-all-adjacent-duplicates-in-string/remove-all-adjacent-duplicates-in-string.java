class Solution {
    public String removeDuplicates(String s) {
      //first we create stringbuiler 
      StringBuilder  p = new StringBuilder();  
        for(int i=0;i<s.length();i++){
           char currvalue = s.charAt(i);

           if( p.length()>0&&p.charAt(p.length()-1)==currvalue  ){
            p.deleteCharAt(p.length()-1);

           }
           else{
            p.append(currvalue);

           } 
        }
        return p.toString();
    }
}