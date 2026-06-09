
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
      public List<Integer> findAnagrams(String s, String p) {
        List<Integer>l=new ArrayList<>();
          int freq1[]=new int[26];
        int freq2[]=new int[26];
        int m=p.length();
        int n=s.length();
        if(m>n) return l;
        for(int i=0;i<m;i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            l.add(0);
        }
        for(int i=m;i<n;i++){
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-m)-'a']--;
            if(Arrays.equals(freq1,freq2)){
                l.add(i-m+1);
            }
        }
        return l;
    }
}
