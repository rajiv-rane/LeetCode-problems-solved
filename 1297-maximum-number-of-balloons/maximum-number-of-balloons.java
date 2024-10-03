class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<text.length();i++){
            if(map.containsKey(text.charAt(i)))
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            else
                map.put(text.charAt(i),1);
        }
        // b1 a1 l2 o2 n1
        int b,a,l,o,n;
        b=map.getOrDefault('b',0);
        a=map.getOrDefault('a',0);
        l=map.getOrDefault('l',0)/2;
        o=map.getOrDefault('o',0)/2;
        n=map.getOrDefault('n',0);
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));

    }
}