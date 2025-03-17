class Solution {
    public int[] resultArray(int[] nums) {
        
        int n=nums.length;
        int res[]=new int[n];
        // int j=0;
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            // if(i==0){
            //     arr1.add(nums[i]);
            // }
            // if(i==1){
            //     arr2.add(nums[i]);
            // }
            
            int ele1=arr1.get(arr1.size()-1);
            int ele2=arr2.get(arr2.size()-1);
            if(ele1>ele2){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }


            
        }
        


        int j=0;
        for(int i:arr1){
            System.out.print(i+" ");
            res[j]=i;
            j++;
        }
        System.out.println();
        for(int i:arr2){
            res[j]=i;
            j++;
            System.out.print(i+" ");
        }
            
        return res;
    }
}