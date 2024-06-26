/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let regex = /^[a-zA-Z0-9]+$/
    let i = 0
    let j = s.length
    while (i < j && j > i){
        if (!regex.test(s.charAt(i))){
            i++
            continue
        } else if (!regex.test(s.charAt(j))){
            j--
            continue
        } else if (s.charAt(i).toUpperCase() !== s.charAt(j).toUpperCase()){
            return false
        } else {
            i++
            j--
        }
    }
    return true
};