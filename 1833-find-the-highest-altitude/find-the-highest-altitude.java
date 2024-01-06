class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude=0,n=gain.length;
        int currAltitude=0;
        for(int i=0;i<n;i++){
            currAltitude=currAltitude+gain[i];
            maxAltitude=Math.max(currAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}