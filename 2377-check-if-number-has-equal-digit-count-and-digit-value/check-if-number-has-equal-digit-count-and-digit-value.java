class Solution {
    public boolean digitCount(String num) {
        int count[]=new int[10]; //n=10 constraint given
        
        for(char ch:num.toCharArray()){
            count[ch-'0']=count[ch-'0']+1;
        }

        for(int i=0;i<num.length();i++){
            int freq=num.charAt(i)-'0'; //freq of each index value
            count[i]=count[i]-freq;
        }
        for(int i:count){
            if(i!=0)
                return false;
        }
        return true;
    }
}