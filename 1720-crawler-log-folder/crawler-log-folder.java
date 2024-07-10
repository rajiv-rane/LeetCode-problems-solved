class Solution {
    public int minOperations(String[] logs) {
        int res=0;
        for(String s:logs){
            if(s.equals("../")){
                res--;
                res=Math.max(res,0);
            }
            else if(s.equals("./"))
                continue;
            else 
                res++;
        }
        return res;
    }
}