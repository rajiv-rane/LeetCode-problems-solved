class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0; int sum2=0;
        int i,j;
        int n=mat.length;
        // int cols=mat[0].length;
        for(i=0;i<n;i++){
            sum1=sum1+mat[i][i];//principal diagonal sum
        }

        i=0;j=n-1;
        while(i<n && j>=0){
           sum2=sum2+mat[i][j];
           i++; j--;
        }
        int finalSum;
        if(n%2!=0){
            //odd order matrix
            finalSum=sum1+sum2-mat[n/2][n/2];
        }
        else{
            finalSum=sum1+sum2;
        }
        
        return finalSum;
    }
}