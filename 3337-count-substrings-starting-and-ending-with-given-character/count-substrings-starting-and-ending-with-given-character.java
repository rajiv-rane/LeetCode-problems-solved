class Solution {
    public long countSubstrings(String s, char c) {
        char arr[]=s.toCharArray();
        long count=0;
        for(char a : arr){
            if(a==c)
                count++;
        }
            // https://youtu.be/9w50JzEOKGY?si=_-opCEe0A9CdmnhR   
        return (count*(count+1))/2; 
    }
}