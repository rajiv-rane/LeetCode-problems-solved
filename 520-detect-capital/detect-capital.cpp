class Solution {
public:
    bool detectCapitalUse(string word) {
        int capsCount=0;
        int lowerCount=0;
        int i;
        for(i=0;i<word.size();i++){
            if(word[i]>='A' && word[i]<='Z'){
                capsCount++;
            }
            else{//word[i]>='a' && word[i]<='z')
                lowerCount++;
            }
        }
        //only first letter caps
        if(capsCount==1 && word[0]>='A' && word[0]<='Z'){
            return true;
        }
        //all caps
        else if(lowerCount==0){
            return true;
        }
        //all lowercase
        else if(capsCount==0){
            return true;
        }
        else{
            return false;
        }
    }
};