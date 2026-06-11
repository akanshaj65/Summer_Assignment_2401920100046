package Week2.Day4;

public class Decodestring {
     public String decodeString(String s) {
        int curr=0;
        String str="";
        Stack<String>stack=new Stack<>();
        Stack<Integer>st=new Stack<>();
       for(char ch:s.toCharArray()){
         if(Character.isDigit(ch)){
            curr=curr*10+(ch-'0');
         }
         else if(ch=='['){
            st.push(curr);
            stack.push(str);
            str="";
            curr=0;
         }
         else if(ch==']'){
            int re=st.pop();
            String prev=stack.pop();
            StringBuilder temp=new StringBuilder(prev);
            for(int i=0;i<re;i++){
                temp.append(str);
            }
            str=temp.toString();

         }
         else{
            str+=ch;
         }
       }
        return str;
    }
    
}
