class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }

        int global_count=0;
        for(String S:words){
            int count=0;
            for(int i=0;i<S.length();i++){
                if(set.contains(S.charAt(i))){
                    count++;
                }
                    
            }
            if(count==S.length())
                global_count++;
        }
        return global_count;
    }
}