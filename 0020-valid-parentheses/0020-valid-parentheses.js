/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if (s.length % 2 !== 0 || s.length === 0) return false
    const toClose = []
    const close = [')', ']', '}']
    const open = ['(', '[', '{']
    for (let i = 0 ; i < s.length; i++){
        const c = s.charAt(i)
        const index = close.indexOf(c)
        if (index !== -1){
            if (toClose.length === 0) return false
            if (toClose[toClose.length - 1] !== open[index]) return false
            toClose.pop() 
        } else toClose.push(c)
    }
    if (toClose.length) return false
    return true


    
};