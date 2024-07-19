class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //traverse entire row
                int rowMin=Integer.MAX_VALUE;
                for(int k=0;k<cols;k++)
                    rowMin=Math.min(matrix[i][k],rowMin);

                int colMax=Integer.MIN_VALUE;
                for(int k=0;k<rows;k++){
                    
                    colMax=Math.max(matrix[k][j],colMax);
                }
                if (rowMin==colMax)
                    list.add(rowMin);
            }
        }
        return list;
    }
}