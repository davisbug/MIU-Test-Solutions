<b>QUESTION 1</b> <br>
Write a function named isSquare that returns 1 if its integer argument is a square of some integer, otherwise it returns 0. Your function must not use any function or method (e.g. sqrt) that comes with a runtime library or class library! <br>

The signature of the function is <b> int isSquare(int n)</b> <br>

<b><u>Test cases: </u></b> <br>
![Question 1](images/isSquare.png)

----------------------------------------------------------------------------------------------
<b>QUESTION 2</b> <br>

A number with a base other than 10 can be written using its base as a subscript. For example, 1011~2~ represents the binary number 1011 which can be converted to a base 10 number as follows:
- (1 * 20) + (1 * 21) + (0 * 22) + (1 * 23) = 1 + 2 + 0 + 8 = 11~10~

Similarily, the base 3  number 112~3~ can be converted to base 10 as follows:
- (2 * 30) + (1 * 31) + (1 * 32) = 2 + 3 + 9 = 14~10~

And the base 8 number 3258 can be converted to base 10 as follows:
- (5 * 80) + (2 * 81) + (3 * 82) = 5 + 16 + 192 = 213~10~

<br>
Write a method named isLegalNumber that takes two arguments. The first argument is an array whose elements are the digits of the number to test. The second argument is the base of the number represented by the first argument. The method returns 1 if the number represented by the array is a legal number in the given base, otherwise it returns 0.
<br>
For example the number 3214 can be passed to the method as follows:
- isLegalNumber(new int[] {3, 2, 1}, 4) <br>
This call will return 1 because 321~4~ is a legal base 4 number.
<br>
However, since all digits of a base n number must be less than n, the following call will return 0 because 371~6~ is not a legal base 6 number (the digit 7 is not allowed)
- isLegalNumber(new int[] {3, 7, 1}, 6)

-----------------------------------------------------------------------------------------------
