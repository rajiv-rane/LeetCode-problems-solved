class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans=new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;

        while(i>=0 || j>=0 || carry==1){
            int sum=0;
            sum+=carry;

            if(i>=0){
                sum+=(a.charAt(i)-'0');
                i--;
            }
                
            if(j>=0){
                sum+=(b.charAt(j)-'0');
                j--;
            }
            
            int bit=sum%2;
            carry=sum/2;
            ans.append(bit);

        }
        return ans.reverse().toString();
    }
}