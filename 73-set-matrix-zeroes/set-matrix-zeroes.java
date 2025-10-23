class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>rowSet=new HashSet<>();
        HashSet<Integer>colSet=new HashSet<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(Integer i: rowSet){
            for(int j=0;j<col;j++){
                matrix[i][j]=0;
            }
        }
        for(Integer j: colSet){
            for(int i=0;i<row;i++){
                matrix[i][j]=0;
            }
        }
    }
}