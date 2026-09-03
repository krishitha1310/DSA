/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
    let len=0;
    for(arg in args){
        len++;
    }
    return len;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
