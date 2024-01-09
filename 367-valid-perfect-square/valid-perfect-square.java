class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(num>0){
            num=num-i;
            i=i+2;//sum of odd numbers=perfect square
            if(num==0){
                return true;
            }
        }
        return false;
    }
}