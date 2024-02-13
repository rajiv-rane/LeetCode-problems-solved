class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=1,i,j;
        int ans=Integer.MIN_VALUE;
        int n=sentences.length;
        // char arr[]=sentences.toCharArray();
        for(i=0;i<n;i++){
            String res = sentences[i];
            count=1;
            for(j=0;j<res.length();j++){
                if(res.charAt(j)==' ')
                    count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}