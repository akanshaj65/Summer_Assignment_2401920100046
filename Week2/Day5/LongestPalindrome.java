public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int l=0;
        int r=0;
        int reslen=0;
        String res="";
        if(s==null || s.length()==0){
            return "";
        }
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            l=i;
            r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1)>reslen){
                    res=s.substring(l,r+1);
                    reslen=r-l+1;
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1)>reslen){
                    res=s.substring(l,r+1);
                    reslen=r-l+1;
                }
                l--;
                r++;
            }
        }
  return res;
    }
    
}
