class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # sort the intervals by the start(first) value
        # check if the current interval overlaps with the prev interval
        intervals.sort(key = lambda i : i[0])
        output=[intervals[0]] #insert the first interval

        for start,end in intervals[1:]:
            lastEnd=output[-1][1]

            if start<= lastEnd: #overlapping
            # we merge
            # take the most the recently added interval's ending value and set it the max of itself
                output[-1][1]=max(lastEnd,end)
            
            else:
                output.append([start,end])
        
        return output
        