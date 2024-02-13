class Solution {
    public int countKDifference(int[] nums, int k) {
        var n = nums.length;
        var ans = 0;

        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i] - k)) {
                ans += map.get(nums[i] - k);
            }
            if (map.containsKey(k + nums[i])) {
                ans += map.get(k + nums[i]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return ans;

    }
}
        // HashMap<Integer,Integer>map=new HashMap<>();
        // int j;
        // int count=0;
        // for(j=0;j<nums.length;j++){
        //     if(map.containsKey(nums[j]))
        //         map.put(nums[j],map.get(nums[j])+1);
        //     else
        //         map.put(nums[j],1);
        // }

        // for(int i: nums){
        //     if(map.containsKey(k-i) || map.containsKey(-i-k)){
        //         if((k-i)==i){
        //             if(map.get(k-i)>1)
        //                 count++;
        //         }
        //         else if((-i-k)==i){
        //             if(map.get(-i-k)>1)
        //                 count++;
        //         }

        //         else{
        //             count++;
        //         }

        //     }
        // }
        // return count;
    
