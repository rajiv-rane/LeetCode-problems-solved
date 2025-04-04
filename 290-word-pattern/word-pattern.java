class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        String[] arr=s.split(" ");
        System.out.println(arr.length+" "+s.length());
        if(arr.length!=pattern.length())
            return false;
        // for(String str:arr){
        //     System.out.print(str+" ");
        // }
        System.out.println();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(arr[i])==false){
                    // System.out.println(map);
                    return false;
                }
                System.out.println(map);
            }
            else{
                // for(String str:map.values()){
                //     if(str==arr[i]) 
                //         return false;
                // }
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(pattern.charAt(i),arr[i]);
                System.out.println(map);
            }
        }
        return true;
    }
}