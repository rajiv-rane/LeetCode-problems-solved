class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int i,j,n;
        int sum;
        int TotalSum=0;
        n=arr.length;
        
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        //get all the subarrays of odd length
        // length of subarray[i,j]=j-i+1
        for(i=0;i<n;i++){
            sum=0;
            for(j=i;j<n;j++){//got both indices i,j
                if((j-i+1)%2!=0){
                    //odd length
                    if(i==0){
                        sum=prefix[j];
                    }
                    else{
                        sum=prefix[j]-prefix[i-1];
                    }
                    TotalSum=TotalSum+sum;
                    
                }

            }
            
        }

        return TotalSum;
    }
}