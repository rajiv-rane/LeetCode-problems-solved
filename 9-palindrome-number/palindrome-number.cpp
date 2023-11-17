class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long long temp=x;
        long long num=0;
        while(temp!=0){
            int last=temp%10;
            num=num*10 + last;
            temp=temp/10;    //update x
        }
        if(x==num){
            return true;
        }
        return false;
        
        
    }
};