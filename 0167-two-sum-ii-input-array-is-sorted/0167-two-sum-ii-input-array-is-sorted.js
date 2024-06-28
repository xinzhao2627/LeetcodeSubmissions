/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let hashtable = new Map()
    for (let i = 0; i < numbers.length; i++){
        const r = target - numbers[i]
        if (hashtable.has(r) && hashtable.get(r) !== i) return [hashtable.get(r)+1,i+1]
        hashtable.set(numbers[i], i)
    }
    return [0, 0]
};