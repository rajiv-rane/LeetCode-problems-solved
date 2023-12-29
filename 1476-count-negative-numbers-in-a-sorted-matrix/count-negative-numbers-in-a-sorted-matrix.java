class Solution {
    public int countNegatives(int[][] grid) {
        int i,j,count=0;
        int row=grid.length;
        int col=grid[0].length;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}