class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // HashMap<Character,Integer>map=new HashMap<>();
        char [] mg=magazine.toCharArray();
        char [] rn=ransomNote.toCharArray();
        int count[]=new int[27];
        Arrays.fill(count,0);
        for(char c:mg){
            int i=c-'a';
            count[i]=count[i]+1;
        }
        for(char c:rn){
            int i=c-'a';
            count[i]=count[i]-1;
            if(count[i]<0)
                return false;
        }
        return true;

    }
}