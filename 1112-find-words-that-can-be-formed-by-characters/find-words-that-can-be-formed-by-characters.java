class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans=0;
        for (char c : chars.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < words.length; i++) {
            int flag=1;
            String str = words[i];
            HashMap<Character, Integer> temp_map = new HashMap<>();
            for (char c : str.toCharArray()) {
                if (temp_map.containsKey(c)) {
                    temp_map.put(c, temp_map.getOrDefault(c, 0) + 1);

                } else {
                    temp_map.put(c, 1);
                }
            }

            for(char c:str.toCharArray()){
                if(map.getOrDefault(c,0)>=temp_map.getOrDefault(c,0)==false){
                    flag=0;
                    break;
                }
                else{
                    flag=1;
                    continue;
                }
            }
            if(flag==1){
                ans=ans+str.length();
            }
        }

        return ans;
    }
}