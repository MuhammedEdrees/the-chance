package week1.ipv4checker

import kotlin.math.log


fun main() {
    println(log(0.0, 10.0).toInt())
}

fun isValidIPV4Address(address: String): Boolean {
    //initialize address segments
    val addressSegments = address.split('.')

    //check if segments count is less than 4 return false
    if (addressSegments.size != 4) return false
    addressSegments.forEach { segment ->

        //if the segment is not integer return false
        val numericSegment = segment.toIntOrNull() ?: return false

        //if there is leading zeros and the number is not 0 return false
        if (segment.startsWith("0") && segment != "0") return false

        //if the number is out of range (0~255) return false
        if (numericSegment !in 0..255) return false
    }
    return true
}

//flow chart: https://drive.google.com/file/d/1XyxQfdL65wUm-HzTVzigUbjqq00pSSS9/view?usp=sharing