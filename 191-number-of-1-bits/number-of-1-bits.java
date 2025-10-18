class Solution {

    boolean checkBit(int n,int i){
        int val=n&(1<<i);
        if(val>0)
            return true;
        else 
            return false;
    }
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if(checkBit(n,i))
                count++;
        }
        return count;
    }
}