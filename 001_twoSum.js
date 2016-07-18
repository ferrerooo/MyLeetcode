/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var dict = [];
    for (var i=0; i<nums.length; i++) {
        if (dict[target - nums[i]] != null)
            return [dict[target - nums[i]], i];
        dict[nums[i]] = i;
    }
    return [];
};

/**
Map is a better solution
 */
var twoSum = function(nums, target) {
    var dict = new Map();
    for (var i=0; i<nums.length; i++) {
        if (dict.has(target-nums[i]))
            return [dict.get(target - nums[i]), i];
        dict.set(nums[i], i);
    }
    return [];
};