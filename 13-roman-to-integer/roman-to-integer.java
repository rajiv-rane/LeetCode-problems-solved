class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.putIfAbsent('I',1);
        map.putIfAbsent('V',5);
        map.putIfAbsent('X',10);
        map.putIfAbsent('L',50);
        map.putIfAbsent('C',100);
        map.putIfAbsent('D',500);
        map.putIfAbsent('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && map.get(s.charAt(i))<map.get(s.charAt(i+1)))
                sum=sum-map.get(s.charAt(i));
            else
                sum=sum+map.get(s.charAt(i));
        }
        return sum;
    }
}