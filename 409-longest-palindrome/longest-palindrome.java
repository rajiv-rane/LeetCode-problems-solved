class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

        int ans=0;
        boolean isFirstOdd=false;
        for(Character key:map.keySet()){
            if(map.get(key)%2==0)
                ans=ans+map.get(key);
            else{
                ans=ans+map.get(key);
                if(isFirstOdd==false)
                    isFirstOdd=true;
                else
                    ans=ans-1;
            }
        }
        return ans;
    }
}