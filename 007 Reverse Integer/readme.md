# Reverse the

Reverse digits of an integer.

>Example1: x = 123, return 321

>Example2: x = -123, return -321

click to show spoilers.

Note:

The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

### Solution:
真真切切的是道简单题，没有太多难度，我的做法是将数字每次除以10取余数，然后用另一个数每次乘以10在加上这个余数，这样的话就得到10进制最小位变成了最大位。

唯一需要特殊考虑的就是overflows的情况，因为题目说的是32-bits的带符号数，所以我们这里只需要保证我们得到的反转数在 -2^31 到 2^31-1 之间就可以的，我们这里用到了第四题Median of two Sorted Array的技巧，只要这个数字不是 -2^31, 我们就可以直接把负数问题转换成相反数，而对于-2^31的情况，我们直接输出0即可。

另外一个问题就是在我们反转的过程中，会有超出2^31的情况发生，我们这里只需要用一个大于其的类型将这个数记录下来，比如long，如果最后我们发现得到的值要超过它的话，我们就判断溢出。这里没有办法再去用正负来判断溢出情况，因为反转的有可能得到的是数倍于原来的数，二进制形式可能是10而不是01，得到的还是正数。

### Expand1: Java 类型

>byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.

>short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.

>int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for unsigned integers.

>long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.

>float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. As with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.

>double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. For decimal values, this data type is generally the default choice. As mentioned above, this data type should never be used for precise values, such as currency.

>boolean: The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.

>char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).


### Expand2: 整数溢出

* 8
byte, octet

Signed: From −128 to 127, from −(27) to 27 − 1

Unsigned: From 0 to 255, which equals 2^8 − 1

* 16
halfword, word, short

Signed: From −32,768 to 32,767, from −(2^15) to 2^15 − 1

Unsigned: From 0 to 65,535, which equals 2^16 − 1

* 32
word, long, doubleword, longword, int

Signed: From −2,147,483,648 to 2,147,483,647, from −(2^31) to 2^31 − 1

Unsigned: From 0 to 4,294,967,295, which equals 2^32 − 1

* 64
word, doubleword, longword, long long, quad, quadword, qword, int64

Signed: From −9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, from −(2^63) to 2^63 − 1

Unsigned: From 0 to 18,446,744,073,709,551,615, which equals 2^64 − 1
