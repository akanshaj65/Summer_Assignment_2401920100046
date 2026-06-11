public class ReverseWords {
     private void reverse(char ch[],int start,int end){
        while(start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char ch[]=s.toCharArray();
        int start=0;
        for(int end=0;end<ch.length;end++){
            if(ch[end]==' '){
                reverse(ch,start,end-1);
                start=end+1;
            }
            else if(end==ch.length-1){
                reverse(ch,start,end);
            }
        }
        
        String st = new String(ch);
        return st;
        
    }
    
}
