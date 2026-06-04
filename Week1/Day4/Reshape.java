public class Reshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[n*i+j]=mat[i][j];
            }
        }
        if(m*n!=r*c) return mat;
        int ma[][]=new int[r][c];
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ma[i][j]=arr[index];
                index++;
            }
        }
        return ma;
    }
}
