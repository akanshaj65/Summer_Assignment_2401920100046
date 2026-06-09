public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
      int l=0;
      int r=0;
      while(l<s.length() && r<t.length()){
        char ch=s.charAt(l);
        char c=t.charAt(r);
        if(ch==c){
            l++;
            r++;
        }else{
            r++;
        }
      }
      if(l==s.length())return true;
      return false;
        
    }
    
}
