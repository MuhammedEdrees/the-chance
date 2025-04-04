package week1.ipv4checker


fun main() {
    //invalid input
    test(
        title = "When the address is blank, it should return false",
        result = isValidIPV4Address(""),
        expectedResult = false
    )
    test(
        title = "When the address contains characters other than (0~255) or dot, it should return false",
        result = isValidIPV4Address("192.168.1.a"),
        expectedResult = false
    )
    test(
        title = "When the address contains numbers greater than 255, it should return false",
        result = isValidIPV4Address("192.168.1.256"),
        expectedResult = false
    )
    test(
        title = "When the address contains numbers lower than 0, it should return false",
        result = isValidIPV4Address("192.168.1.-1"),
        expectedResult = false
    )
    test(
        title = "When the address is lower than 4 segments, it should return false",
        result = isValidIPV4Address("192.168.1"),
        expectedResult = false
    )
    test(
        title = "When the address is greater than 4 segments, it should return false",
        result = isValidIPV4Address("192.168.1.1.2"),
        expectedResult = false
    )
    test(
        title = "When any of the address segments contain leading zeros(except value 0), it should return false",
        result = isValidIPV4Address("192.168.001.1"),
        expectedResult = false
    )
    test(
        title = "When the address contains more than 3 dots, it should return false",
        result = isValidIPV4Address("192.168.1.1."),
        expectedResult = false
    )
    test(
        title = "When the address contains consecutive dots, it should return false",
        result = isValidIPV4Address("192.168..1"),
        expectedResult = false
    )
    test(
        title = "When the address contains extra spaces, it should return false",
        result = isValidIPV4Address("192.168.1.1  "),
        expectedResult = false
    )
    //valid input
    test(
        title = "When the address contains four segments separated by 3 dots," + "each segment contains a number in the range 0~255 and there is no leading zeros except for the digit 0 itself," + "it should return true",
        result = isValidIPV4Address("255.168.0.1"),
        expectedResult = true
    )
}


fun test(
    title: String,
    result: Boolean,
    expectedResult: Boolean,
) {
    if (result == expectedResult) {
        println("Success: $title")
    } else {
        println("Failure: $title")
    }
}