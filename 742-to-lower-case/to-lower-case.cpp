class Solution {
public:
    string toLowerCase(string s) {
        for(int i=0;i<s.size();i++){
            if(s[i]<='Z' && s[i]>='A'){
                //it's uppercase character
                //convert to lower
                s[i]=s[i]^32; //toggle the 6th bit from right
            }
        }
        return s;
    }
};