import java.util.*;
public class ContainsDulicates {
     public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
        
    }
    
}
