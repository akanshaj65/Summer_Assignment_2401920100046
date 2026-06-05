public class ValidPalindrome{
     public boolean isPalindrome(String s) {
      String str=s.toLowerCase();
      String result="";
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
         if((ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
            result+=ch;
         }
      }
      int n=result.length();
      for(int i=0;i<result.length();i++){
        if(result.charAt(i)!=result.charAt(n-i-1)){
            return false;
        }
      }
      return true;

    }
}