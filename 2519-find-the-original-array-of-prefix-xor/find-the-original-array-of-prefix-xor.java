class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int [] pf=new int[n];
         pf[0]=pref[0];
        for(int i=1;i<n;i++){
            pf[i]=pref[i-1]^pref[i];
        }
        return pf;
    }
}