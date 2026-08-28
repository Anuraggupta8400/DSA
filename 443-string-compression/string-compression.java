class Solution {
    public int compress(char[] chars) {
        int readidx =0;
        int writeidx= 0;
        while(readidx<chars.length){
            char currchar = chars[readidx];
            int count = 0;
            //cout duplicate char 
            while(readidx<chars.length && currchar ==chars[readidx]){
                readidx++;
                count++;
            }
             chars[writeidx]= currchar;
             writeidx++;
             if(count >1){
                String countstr = String.valueOf(count);
                for( char digit:countstr.toCharArray()){
                    chars[writeidx] =digit ;
                    writeidx++;
                }
             }
        }
        return writeidx;
                   
    }
}