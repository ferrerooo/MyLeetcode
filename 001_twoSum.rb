# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    
    dict = {}
    nums.each_with_index {|n, i| dict[target - n]? (return [dict[target - n], i]) : dict[n] = i}
end