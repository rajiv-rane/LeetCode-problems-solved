class Solution {
    int sum(int num){
        int ans=0;
        while(num>0){
            ans=ans+num%10;
            num=num/10;
        }
        return ans;
    }
    public int addDigits(int num) {
        while(num>9)
            num=sum(num);
        return num;
    }
}