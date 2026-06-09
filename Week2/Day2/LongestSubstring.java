import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int len=0;
        int maxLen=0;
        HashMap<Character,Integer>map=new HashMap<>();
    
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(map.get(s.charAt(r))+1,l);
            }
            len=r-l+1;
            maxLen=Math.max(len,maxLen);
            map.put(s.charAt(r),r);
            r++;
            
        }
        return maxLen;
        
    }
    
}
