class Solution:
    def reverseWords(self, s: str) -> str:
        # s=s.strip()
        # temp=s.strip().split(" ")
        # st=""
        # for i in range(len(temp)-1,-1,-1):
            
            # st=st+str(temp[i])
            # while(str(temp[i])==" "):
            #     i=i+1
            # st=st+str(temp[i])
            # st=st+" "
            # print(st)




        # i=len(temp)-1
        # while(i>=0):
            
        #     st=st+str(temp[i])
        #         # if(str(temp[i-1]!=" ")):
        #     st+=temp[i]+" "
        #     i=i-1
        #     print(st)

        # return st.strip()
        

        temp = s.strip().split()
        st = "" 
        i = len(temp) - 1
        while i >= 0:
            st += temp[i] + " "
            i -= 1
            print(st)

        
        return st.strip()        