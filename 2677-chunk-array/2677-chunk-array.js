/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let answer = [];
    let tmp = [];
    for(let i = 0; i < arr.length; i++){
        tmp.push(arr[i]);
        if(tmp.length == size || i == arr.length - 1){
            answer.push(tmp);
            tmp = [];
        }
    }
    return answer;
};
