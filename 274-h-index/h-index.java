class Solution {
    public int hIndex(int[] citations) {
        // sort the array and then check from the end
        // if the count (citations[i] value)==index from end then it's a H index.
        // if the condition of the loop fails then the i-1 element is the H index

        Arrays.sort(citations);
        int n=citations.length;
        int i;
        for(i=1;i<=n;i++){
            if(citations[n-i]<i)
            break;
        }
        return i-1;
    }
}