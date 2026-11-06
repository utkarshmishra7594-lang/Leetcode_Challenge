class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        freq={}
        for index in range(0,n):
            need=target-nums[index]
            if need in freq:
                return [index,freq[need]]
            freq[nums[index]]=index
        


