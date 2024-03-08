class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        int maxfreq=0;
        for(int i=0;i<n;i++){
            maxfreq=Math.max(map.get(nums[i]),maxfreq);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==maxfreq)
                count++;
        }
        return count;
    }
}