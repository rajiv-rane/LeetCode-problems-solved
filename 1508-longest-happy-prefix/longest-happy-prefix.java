class Solution {
    public String longestPrefix(String s) {
        char str[]=s.toCharArray();
        int n=str.length;
        int lps[]=new int[n];

        Arrays.fill(lps,0);

        for(int i=1;i<n;i++){
            int x=lps[i-1];
            while(str[i]!=str[x]){
                if(x==0){
                    x=-1;
                    break;
                }
                x=lps[x-1];//mis-match
            }
            lps[i]=x+1;
        }
        int max_idx=0;
        // for(int i=0;i<n;i++){
        //     if(lps[i]>max_idx){
        //         max_idx=lps[i];
        //     }
        // }
        // String result="";
        // for(int i=0;i<=lps[n-1];i++){
        //     result+=str[i];
        // }
        return s.substring(0, lps[n-1]);
    }
}