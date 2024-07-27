/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0
    let cheapest = prices[0]
    for (const p of prices.slice(1, prices.length)){
        cheapest = (p < cheapest) ? p : cheapest
        maxProfit = (p - cheapest > maxProfit) ? p - cheapest : maxProfit
    }
    

    return maxProfit

};