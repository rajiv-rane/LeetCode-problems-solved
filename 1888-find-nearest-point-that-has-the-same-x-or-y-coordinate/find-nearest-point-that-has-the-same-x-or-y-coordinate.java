class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int i,j; int n=points.length;//rows
        int m=points[0].length;//cols
        int min_dist=Integer.MAX_VALUE;
        int index=-1;
        for(i=0;i<n;i++){
            if(x==points[i][0]||y==points[i][1]){
                int dist=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(dist<min_dist){
                    min_dist=dist;
                    index=i;
                }
            }
            
        }
        return index;
    }
        
    
}
