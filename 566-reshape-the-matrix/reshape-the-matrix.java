class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n){
            return mat;
        }
        int[][] arr=new int[r][c];
        int a=0,b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(b==n){
                    a++;
                    b=0;
                }
                arr[i][j]=mat[a][b];
                b++;
            }
        }
        return arr;
    }
}