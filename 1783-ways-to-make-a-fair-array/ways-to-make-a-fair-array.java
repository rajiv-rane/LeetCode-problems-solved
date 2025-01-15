class Solution {
    public int waysToMakeFair(int[] nums) {
//sum of even index after removing i: Se=Se[0 ,i-1]+So[i+1 ,n-1]
//sum of odd index after removing i: So=So[0, i-1]+Se[i+1 ,n-1]
// Se=pfEven[i-1]+(pfOdd[n-1]-pfOdd[i])
// Sd=pfOdd[i-1]+(pfEven[n-1]-pfEven[i])
// if(i==0) : pf[i-1]=0; (edge case)
        int n=nums.length;
        if(n==1)return 1;
        int pfeven[]=new int[n];    int pfodd[]=new int[n];
        pfeven[0]=nums[0]; pfodd[0]=0; //initialization 

        for(int i=1;i<n;i++){
            if(i%2==0){
                pfeven[i]=pfeven[i-1]+nums[i];
                pfodd[i]=pfodd[i-1];
            }
            else{
                pfodd[i]=pfodd[i-1]+nums[i];
                pfeven[i]=pfeven[i-1];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            int oddsum;int evensum;
            if(i==0){
                oddsum=pfeven[n-1]-pfeven[i];
                evensum=pfodd[n-1]-pfodd[i];
            }
            else{
                oddsum=(pfodd[i-1])+pfeven[n-1]-pfeven[i];
                evensum=pfeven[i-1]+pfodd[n-1]-pfodd[i];
            }
            if(oddsum==evensum){
                count++;
            }
        }
        return count;

    }
}