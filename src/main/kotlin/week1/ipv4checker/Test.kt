package week1.ipv4checker

/**
 * Constraints:
 * - IPv4 address consists of four numeric segments separated by dots (.)
 * - Each segment must be a number between 0 and 255, inclusive
 * - Leading zeros in any segment (e.g., "01" or "001") are not allowed, except for the digit "0" itself.
 * - The address must contain exactly three dots and no extra characters.
 */
fun main(){
    //invalid input
    test(
        title = "Invalid characters test case",
        result = isValidIPV4("192.168.1.a"),
        expectedResult = false
    )
    test(
        title = "Out of range number test case",
        result = isValidIPV4("192.168.1.256"),
        expectedResult = false
    )
    test(
        title = "Input shorter than expected test case",
        result = isValidIPV4("192.168.1"),
        expectedResult = false
    )
    test(
        title = "Leading zeros test case",
        result = isValidIPV4("192.168.001.1"),
        expectedResult = false
    )
    test(
        title = "Extra dot test case",
        result = isValidIPV4("192.168.001.1."),
        expectedResult = false
    )
    //valid input
    test(
        title = "Valid address test case",
        result = isValidIPV4("192.168.1.1"),
        expectedResult = true
    )
    test(
        title = "Valid address with 0 test case",
        result = isValidIPV4("192.168.0.1"),
        expectedResult = true
    )
}


fun test(
    title: String,
    result: Boolean,
    expectedResult: Boolean,
){
    if(result == expectedResult){
        println("Success: $title")
    } else {
        println("Failure: $title")
    }
}