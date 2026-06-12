public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map=new HashMap<>();
        List<String>s=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(str);
            
        }
       return new ArrayList<>(map.values());
    }
}