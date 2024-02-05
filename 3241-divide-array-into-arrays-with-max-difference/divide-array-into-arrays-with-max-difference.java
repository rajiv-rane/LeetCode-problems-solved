class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // int n=nums.length;
        // int i,j;
        // HashMap<Integer,Integer>map=HashMap<>();
        // for(int a: nums){//Inseter elements in HashMap
        //     if(map.containsKey(a)){
        //         map.put(a,map.get(a)+1);//increment freq
        //     }
        //     else{
        //         map.put(a,1);
        //     }
        // }
        // Sort the input array in ascending order
        Arrays.sort(nums);
        // Calculate the number of subarrays to be created
        int numArrays = (int)Math.ceil(nums.length / 3.0);
        // Initialize a 2D array to store the divided arrays
        int[][] ans = new int[numArrays][3];

        // Iterate through the sorted array with a step of 3
        for (int i = 0, j = 0; i < nums.length; i += 3, j++)
        {
            // Check if there are at least 3 elements remaining and their difference is within k
            if (i + 2 < nums.length && nums[i + 2] - nums[i] <= k)
                // If conditions met, add the current set of elements to the answer array
                ans[j] = new int[]{nums[i + 2], nums[i + 1], nums[i]};
            else
                // If conditions not met, return an empty array
                return new int[0][0];
        }
        // Return the 2D array containing divided arrays
        return ans;
        
    }
}