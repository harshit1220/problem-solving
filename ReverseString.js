function reverseStringCharacters(inputString) {
    var reversedString = inputString.split('').reverse().join('');
    return reversedString;
}
var input = "Hello, World!";
var reversed = reverseStringCharacters(input);
console.log(reversed);
