class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
#         remove the all non alphanumeric letters so I used the re ("regular expression") module
# and in re module I used .sub() function with pattern [^a-zA-Z0-9]
# Then after removing non alphanumeric letters I converted the string into lowercase letters using lower function
# then reversed the string using slicing and then checking if the reversed string is same as original string return true else return false
        s= re.sub(r'[^a-zA-Z0-9]', '', s)
        s=s.lower()
        print(s)
        # s.replace(" ","")
        # s.lower()
        # rev=s[::-1]
        if(s==s[::-1]):
            return True
        else:
            return False
