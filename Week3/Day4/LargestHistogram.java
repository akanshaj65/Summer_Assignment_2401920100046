public class LargestHistogram {
    private int[] nse(int arr[]){
        int n=arr.length;
        int a[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && arr[s.peek()]>=curr){
                s.pop();
            }if(s.isEmpty()){
                a[i]=n;
            }else{
                a[i]=s.peek();
            }
            s.push(i);
        }
        return a;
    }
    private int[] pse(int arr[]){
        int n=arr.length;
        int a[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
            int curr=arr[i];
            while(!s.isEmpty() && arr[s.peek()]>curr){
                s.pop();
            }if(s.isEmpty()){
                a[i]=-1;
            }else{
                a[i]=s.peek();
            }
            s.push(i);
        }
        return a;
    }
    public int largestRectangleArea(int[] heights) {
        int n[]=nse(heights);
        int p[]=pse(heights);
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int area=heights[i]*(n[i]-p[i]-1);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    
}
