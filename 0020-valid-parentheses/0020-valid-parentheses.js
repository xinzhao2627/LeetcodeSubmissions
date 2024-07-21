/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if (s.length % 2 !== 0) return false
    const par_o = new Map()
    const par_c = new Map()
    par_o.set('(', 0)
    par_c.set(')', 0)
    par_o.set('[', 0)
    par_c.set(']', 0)
    par_o.set('{', 0)
    par_c.set('}', 0)
    const close = [')', ']', '}']
    const open = ['(', '[', '{']
    for (let i = 0 ; i < s.length; i++){
        if (close.includes(s[i])){
            const o = open[close.indexOf(s.charAt(i))]
            if (par_o.get(o) === 0) return false
            else par_c.set(s.charAt(i), par_c.get(s.charAt(i)) + 1)
        } else {
            par_o.set(s.charAt(i), par_o.get(s.charAt(i)) +1)
        }
    }
    for (let [v, k] of par_o){
        if (v > 0) return false
    }
    for (let [v, k] of par_c){
        if (v > 0) return false
    }
    return true


    
};