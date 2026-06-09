
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++){
            String str=haystack.substring(i,i+n);
            if(needle.equals(str)){
                return i;
            }
        }
        return -1;
       
    }
    
}
