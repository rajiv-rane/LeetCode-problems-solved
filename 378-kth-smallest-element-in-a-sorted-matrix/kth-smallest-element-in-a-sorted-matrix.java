class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int arr[]=new int[n*n];
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[x]=matrix[i][j];
                x++;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n*n;i++){
            System.out.print(arr[i]+" ");
        }
        return arr[k-1];
    }
}