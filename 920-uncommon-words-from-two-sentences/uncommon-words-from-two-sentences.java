class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[] sen1 = s1.split(" ");
        String[] sen2 = s2.split(" ");
        HashMap<String,Integer>map1=new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        
        for(String str:sen1){
            map1.put(str,map1.getOrDefault(str,0)+1);
        }

        for(String str:sen2){
            map2.put(str,map2.getOrDefault(str,0)+1);
        }

        ArrayList<String>list=new ArrayList<>();
        for(String str:map1.keySet()){
            if(map1.get(str)==1 && map2.containsKey(str)!=true)
                list.add(str);
        }

        for(String str:map2.keySet()){
            if(map2.get(str)==1 && map1.containsKey(str)!=true)
                list.add(str);
        }
        return list.toArray(new String[0]);
    }
}