class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.length() == 0)
            return ans;
        ans.add("");

        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", 
        "mno", "pqrs", "tuv", "wxyz" };

        for(int i=0;i<digits.length();i++){
            int index=Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String permutation=ans.remove();
                for(char c:mapping[index].toCharArray()){
                    ans.add(permutation+c);
                }
            }
        }
        return ans;
    }
}