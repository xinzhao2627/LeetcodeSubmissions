/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let fs = s.split(/[^a-zA-Z0-9]+/).join('').toLowerCase()
    let i = 0, j = fs.length -1
    while (i<j && j>i){
        if (fs[i] !== fs[j]) {return false}
        else{
            i++
            j--
        }
    }
    return true
};