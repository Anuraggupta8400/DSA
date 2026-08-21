class Solution {
    public String reverseWords(String s) {
     StringBuilder ans = new StringBuilder();
     int i = s.length()-1;
     while(i>=0){//it remove trailing space 
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        //check value of i here 
        if( i < 0){
            break;
        }
        int j = i;
        //find the start index of word for loop is implemented j traverse left side of word at last point to first point of word until space not found 
        while(j>=0 && s.charAt(j) != ' '){
            j--;
        } 
        //after get spave they stop and store the word in ans 
        ans.append(s.substring(j+1,i+1));
        //add a space in ans remove extra space in word 
        while( j >= 0 &&s.charAt(j) ==' '){
            j--;
        }// j<0 we on first word or first word me space need nhi h

        if(j >= 0){//spece demanded
            ans.append(' ');
        }
        //after word traverse move on next word on i at remaining string 
        i = j;
     }   
     return ans.toString();
    }
}