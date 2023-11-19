class Solution {
public:
    int reverse(int x) {
        int h= -2147483648;
        int k=2147483647;

        long last_digit=0;
        long num=0;
        while(x!=0){
            last_digit=x%10;
            num=num*10+last_digit;
            x=x/10;
        }
        if(num>k  || num<h){
            return 0;
        }
        else{
            return (int)num;
        }
    }
};