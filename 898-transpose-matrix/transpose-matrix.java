class Solution {
    public int[][] transpose(int[][] matrix) {
       int i,j;
       int rows=matrix.length;
       int cols=matrix[0].length; 
       //iterate upper triangular matrix
       int [][] matrix2=new int[cols][rows];
       for(i=0;i<rows;i++){
           for(j=0;j<cols;j++){
            matrix2[j][i]=matrix[i][j];   
           }
       }
       return matrix2;
    }
}