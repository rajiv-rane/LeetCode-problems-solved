class Solution {
    // int mid = low + ((high - low) / 2);

    // Alternatively
    // int mid = (low + high) >>> 1;
    boolean bsearch(int[] nums, int original) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == original)
                return true;
            else if (nums[mid] > original) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;

    }

    public int findFinalValue(int[] nums, int original) {
        // Arrays.sort(nums);
        // while (bsearch(nums, original)) {
        //     original = original * 2;
        // }
        // return original;

        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
            set.add(i);
        while(true){
            if(set.contains(original)){
                original=original*2;
            }
            else{
                break;
            }
        }
        return original;
    }
}