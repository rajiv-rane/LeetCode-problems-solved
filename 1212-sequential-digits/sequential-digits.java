class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String c="123456789";
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<c.length();i++){
            for(int j=i+1;j<c.length();j++){
                int curr=Integer.parseInt(c.substring(i,j+1));
                //c.substring(i,j)=> returns substring from index [i,j-1]
                if(curr>=low && curr<=high)
                    list.add(curr);
            }
        }
        list.sort(null);
        return list;
    }
}