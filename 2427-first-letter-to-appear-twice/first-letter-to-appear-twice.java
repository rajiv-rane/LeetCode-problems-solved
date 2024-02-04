class Solution {
    public char repeatedCharacter(String s) {
        char str[]=new char[s.length()];
        int i;
        int n=str.length;
        ///convert string to char[]
        for(i=0;i<n;i++){
            str[i]=s.charAt(i);
        }
        HashSet<Character>set=new HashSet<>();
        //traverse over array
        for(i=0;i<n;i++){
            
            if(set.contains(str[i])){//update freq if present
                
                return str[i];
                // break;
            }
            else{//add element & set freq=1
                set.add(str[i]);
            }
        }
        return str[i];

    }
}