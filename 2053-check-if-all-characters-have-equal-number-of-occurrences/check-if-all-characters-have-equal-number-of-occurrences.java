class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int i=0; i<s.length()-1; i++) {
            int count = map.get(s.charAt(i));
            if(count!=map.get(s.charAt(i+1))) return false;
        }
    return true;
    }
}