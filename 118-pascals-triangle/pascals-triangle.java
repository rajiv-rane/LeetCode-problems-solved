class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> Tri=new ArrayList<>();
        
        if(numRows==1){
            List<Integer>firstrow=new ArrayList<>();
            firstrow.add(1);
            Tri.add(firstrow);
            return Tri;
        }
            
        int [][]dp=new int[numRows][numRows];
        //first row
        List<Integer>firstrow=new ArrayList<>();
        firstrow.add(1);
        Tri.add(firstrow);
        //2nd row
        List<Integer>row2=new ArrayList<>();
        row2.add(1);
        row2.add(1);
        Tri.add(row2);

        
        dp[0][0]=dp[1][1]=dp[1][0]=1;//base cases

        for(int i=2;i<numRows;i++){
            List<Integer>row=new ArrayList<>();
            dp[i][0]=1;
            row.add(dp[i][0]);
            
            for(int j=1;j<i;j++){
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                row.add(dp[i][j]);
            }
            dp[i][i]=1;
            row.add(dp[i][i]);
            Tri.add(row);
        }
        return Tri;
    }
}