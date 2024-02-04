class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int i,j;
        //create map
        for(int k : arr){
            if(map.containsKey(k))//if present then update freq
                map.put(k,map.get(k)+1);
            else
                map.put(k,1);//insert and set freq=1
        }
        /*iterate over the array and check for 
        each distinct element frequency in map*/
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]) continue;
                else if(map.get(arr[i])==map.get(arr[j]))
                    return false;
            }
        }
        return true;
    }
}