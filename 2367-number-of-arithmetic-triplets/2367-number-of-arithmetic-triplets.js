/**
 * @param {number[]} nums
 * @param {number} diff
 * @return {number}
 */
var arithmeticTriplets = function(nums, diff) {
    const numsMap = new Map()
    nums.forEach((n, i) => numsMap.set(n, i))
    let output = 0 
    for (let i = 0; i < nums.length; i++){
        const targetJ = nums[i] + diff
        const targetK = targetJ + diff
        if (numsMap.has(targetJ) && numsMap.has(targetK) && nums[i] < targetJ && targetJ < targetK){
            output++
        }
    }
    return output    
};