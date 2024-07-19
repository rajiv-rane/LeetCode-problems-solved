class Solution {
    public boolean checkIfExist(int[] arr) {
        // HashSet<Integer>set=new HashSet<>();
        // for(int i:arr){
        //     set.add(i);
        // }
        // for(int i:arr){
        //     if(set.contains(2*i))
        //         return true;
        // }
        // return false;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==2*arr[j])
                    return true;
            }
        }
        return false;
    }
}