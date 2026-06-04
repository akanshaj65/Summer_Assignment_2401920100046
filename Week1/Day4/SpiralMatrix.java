public class SpiralMatrix{
public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>l=new ArrayList<>();
        int s1=0;
        int s2=0;
        int e1=matrix.length-1;
        int e2=matrix[0].length-1;
        while(s1<=e1 && s2<=e2){
            for(int j=s2;j<=e2;j++){
                l.add(matrix[s1][j]);
            }
            for(int i=s1+1;i<=e1;i++){
                l.add(matrix[i][e2]);
            }
            for(int j=e2-1;j>=s2;j--){
                if(s1==e1) break;
                l.add(matrix[e1][j]);
            }
            for(int i=e1-1;i>s1;i--){
                if(s2==e2) break;
                l.add(matrix[i][s2]);
            }
            s1++;
            s2++;
            e1--;
            e2--;
        }
        return l;
    } 
}
    

