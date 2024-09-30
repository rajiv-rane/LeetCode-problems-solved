class Solution {
    void merge(int[] nums, int s,int m,int e){
        int[] temp=new int[e-s+1];
        int p1,p2,p3;
        p1=s;p2=m+1;p3=0;

        while(p1<=m && p2<=e){
            if(nums[p1]<=nums[p2]){
                temp[p3]=nums[p1];
                p1++;
                p3++;
            }
            else{
                temp[p3]=nums[p2];
                p3++;
                p2++;
            }
        }
        while(p1<=m){
            temp[p3]=nums[p1];
            p1++;
            p3++;
        }
        while(p2<=e){
            temp[p3]=nums[p2];
            p2++;
            p3++;
        }

        for(int i=s;i<=e;i++){
            nums[i]=temp[i-s];
        }
    }
    void mergeSort(int[] nums,int s,int e){
        if(s==e) return;
        int m=(s+e)/2;
        mergeSort(nums,s,m);
        mergeSort(nums,m+1,e);
        merge(nums,s,m,e);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}