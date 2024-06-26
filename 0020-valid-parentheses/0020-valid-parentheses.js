/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if (s.length % 2 !== 0 || s.length === 0 ) return false
    const unclosed = []
    const closed_type = [']',  '}', ')']
    const open_type = ['[', '{', '(']
    for (let i = 0; i < s.length; i++){
        const c = s.charAt(i)
        const index = open_type.indexOf(c)
        if (index !== -1){
            unclosed.push(closed_type[index])
        } else if (unclosed.length !== 0){
            if (c === unclosed[unclosed.length - 1]) {
                unclosed.pop()
            } else {
                return false
            }
        } else {
            return false
        }
    }
    if (unclosed.length === 0) return true
    else {
        return false
    }
};