class Solution {
    public int similarPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                String str1=words[i];
                String str2=words[j];
                HashSet<Character>set1=new HashSet<>();
                HashSet<Character>set2=new HashSet<>();
                for(char c:str1.toCharArray()){
                    set1.add(c);
                }
                for(char c:str2.toCharArray()){
                    set2.add(c);
                }

                int count=0;
                for(Character c:set1){
                    if(set2.contains(c))
                        count++;
                }
                if(set1.equals(set2)){
                    ans++;
                    System.out.println(words[i]+" "+words[j]);
                }
                    
            }
        }
        return ans;
    }
}