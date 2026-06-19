public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>d=new ArrayDeque<>();
       List<Integer>li=new ArrayList<>(); 
       for(int i=0;i<nums.length;i++){
        if(!d.isEmpty() && d.peekFirst()<=i-k){
            d.pollFirst();
        }
        while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
            d.pollLast();
        }
        d.offerLast(i);
        if(i>=k-1){
            li.add(nums[d.peekFirst()]);
        }
       }
       int arr[]=new int[li.size()];
       for(int i=0;i<li.size();i++){
        arr[i]=li.get(i);
       }
       return arr;
    }
    
}
