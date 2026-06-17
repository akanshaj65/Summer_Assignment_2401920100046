public class ValidParenthesis{
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            if((ch==')' && st.peek()=='(')||(ch=='}' && st.peek()=='{')||(ch==']' && st.peek()=='[')){
                st.pop();
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;    
    }
}