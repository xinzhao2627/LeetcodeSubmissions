/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let i = 0
    let j = numbers.length-1
    while (i < j && j > i){
        
        if (numbers[i] + numbers[j] === target) return [++i, ++j]
        if (numbers[i] + numbers[j] > target) j--
        else i++
    }
    return [0, 0]
};