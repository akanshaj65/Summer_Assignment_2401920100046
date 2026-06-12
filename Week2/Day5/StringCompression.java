public class StringCompression {
    public int compress(char[] chars) {
        int l=0;
        int r=0;
        int i=0;
        while(r<chars.length){
            while (r < chars.length && chars[r] == chars[l]) {
                r++;
            }
                chars[i]=chars[l];
                i++;
                int num=r-l;
                if(num>1){
                    String nums=Integer.toString(num);
                    for(int k=0;k<nums.length();k++){
                        chars[i]=nums.charAt(k);
                        i++;
                    }
                     
                    }
                    l=r;
            }
           return i;
        }
    
}
