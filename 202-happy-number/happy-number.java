class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seenSet=new HashSet<>();
        // loop until n becomes one (if n becomes 1 then it's happy number)
        while(n!=1 && !seenSet.contains(n)){
            // Add n to the set of seen numbers
            seenSet.add(n);
            // Compute the sum of the squares of the digits of n
            int sum=0;
            while(n!=0){
                int l=n%10;
                sum+=l*l;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
            return true;
        else
            return false;
    }
}