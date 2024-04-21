class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum=0
        ans = -sys.maxsize-1
        for i in nums:
            sum=sum+i
            ans=max(ans,sum)
            if(sum<0):
                sum=0
        return ans
        