import java.util.*;
class Solution {
    HashMap<Integer,Integer>map;
    Solution(){
        map=new HashMap<>();
        System.out.println("hi");
    }
    int test(int n,HashMap map){
        if(map.containsKey(n))
            return (int)map.get(n);
        
        else
        {
            map.put(n,climbStairs(n-1)+climbStairs(n-2));
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }
    // sample();
    public int climbStairs(int n) {

        map.put(2,2);
        map.put(1,1);
        return test(n,map);
            
            
    }
}