public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        String st=str.substring(1,str.length()-1);
        return st.contains(s);
        
    }   
}
