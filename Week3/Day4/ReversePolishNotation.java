public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
             int ans=0;
           if(!ch.equals("+") && !ch.equals("-") &&
            !ch.equals("*") && !ch.equals("/") ){
                st.push(Integer.parseInt(ch));
            }else {
                
                    int a=st.pop();
                    int b=st.pop();
                    if(ch.equals("+")){
                        ans=a+b;
                    }
                    if(ch.equals("-")){
                        ans=b-a;
                    }
                    if(ch.equals("*")){
                        ans=a*b;
                    }
                    if(ch.equals("/")){
                        ans=b/a;
                    }
                
                st.push(ans);
            }
        }
        return st.pop();
        
    }
}
