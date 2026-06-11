public class GenerateParenthesis{
    private void paren(int n,int open,int close,String s,List<String>l){
        if(s.length()==2*n){
            l.add(s);
            return;
        }
        if(open<n){
            paren(n,open+1,close,s+'(',l);
        }
        if(close<open){
            paren(n,open,close+1,s+')',l);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String>l=new ArrayList<>();
        String s="";
        paren(n,0,0,s,l);
        return l;
    }
}