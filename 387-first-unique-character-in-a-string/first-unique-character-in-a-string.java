class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        char str[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            str[i]=s.charAt(i);
        }

        for(int i=0;i<s.length();i++){
            if(map.containsKey(str[i])){//update freq if element present
                map.put(str[i],map.get(str[i])+1);
            }
            else{
                map.put(str[i],1);
            }
        }
        

        for(int i=0;i<str.length;i++){
            if(map.containsKey(str[i])){
                if(map.get(str[i])==1){
                    return i;
                }
            }
        }
        return -1;
        // for(char a : s){
        //     if(map.containsKey(a)){//update freq if element present
        //         map.put(a,map.get(a)+1);
        //     }
        //     else{
        //         map.put(a,1);
        //     }
        // }
    }
}