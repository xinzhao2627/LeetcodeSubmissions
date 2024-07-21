/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if (s.length % 2 !== 0 || s.length === 0) return false
    const toClose = []
    const close = [')', ']', '}']
    const open = ['(', '[', '{']
    for (const c of s){
        const index = close.indexOf(c)
        if (index !== -1){
            if (toClose.length === 0 || open[index] !== toClose.pop()) return false
        }     
        else toClose.push(c)
    }
    if (toClose.length) return false
    return true


    
};