class Solution {
public:
    int reverse(int x) {
        

        // long last_digit=0;
        long num=0;
        while(x!=0){
            num=num*10+(x%10);
            x=x/10;//update number
            // last_digit=x%10;
            // num=num*10+last_digit;
            // x=x/10;
        }
        if(num>2147483648  || num<-2147483648){
            return 0;
        }
        else{
            return (int)num;
        }
    }
};