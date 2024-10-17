class Solution {
    boolean isSelf(int n){
        int temp=n;
        if(n<10){
            return true;
        }
        while(temp>0){
            int ld=temp%10;
            System.out.println(temp+" "+ld);
            if(ld==0)
                return false;
            if(n%ld!=0)
                    return false;
            // if(ld!=0)
            //     if(n%ld!=0)
            //         return false;
            temp=temp/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelf(i))
                list.add(i);
        }
        return list;
    }
}