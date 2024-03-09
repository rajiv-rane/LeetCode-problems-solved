class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        HashSet<Character>Set=new HashSet<>();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        // for(int i=0;i<alpha.length();i++){
        //     Set.add(alpha.charAt(i),0);
        // }
        for(int i=0;i<n;i++){
            Set.add(sentence.charAt(i));
        }
        for(int i=0;i<alpha.length();i++){
            if(!(Set.contains(alpha.charAt(i))))
                return false;
        }
        return true;
    }
}