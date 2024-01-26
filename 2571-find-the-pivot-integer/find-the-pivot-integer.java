class Solution {
    public int pivotInteger(int n) {
        //sum of n natural numbers in AP
        int sum=n*(n+1)/2;
        int pivot=(int)Math.sqrt(sum);
        if(pivot*pivot==sum){
            return pivot;
        }
        else{
            return -1;
        }
    }
}