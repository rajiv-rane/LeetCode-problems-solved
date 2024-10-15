class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        temp=s.strip().split()
        n=len(temp)
        return len(temp[n-1])
        