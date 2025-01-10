class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.length()==1) return true;

        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){

                map.put(c,map.getOrDefault(c,0)+1);
            
        }
        // char arr[]=s.toCharArray();
        int freq=map.get(s.charAt(0));
        for(char c:map.keySet()){
            if(map.get(c)!=freq)
                return false;
        }
        return true;
    }
}