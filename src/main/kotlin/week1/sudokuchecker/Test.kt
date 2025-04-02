package week1.sudokuchecker

import org.example.week1.sudokuchecker.isValidSudokuBoard

fun main(){
    //bad input
    test(
        title = "Invalid characters test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', 'a', '4', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
                charArrayOf('2', '1', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '4', '2')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "Wrong input size test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', 'a', '4', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
                charArrayOf('2', '1', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6')
            ),
        ),
        expectedResult = false
    )
    //invalid sudoku board
    test(
        title = "Invalid same row repetition test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '1', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '8', '9', '-', '2', '3', '4', '5', '6'),
                charArrayOf('2', '1', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '4', '2')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "Invalid same column repetition test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
                charArrayOf('1', '-', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '4', '2')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "Invalid same subgrid repetition test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '8', '1', '-', '2', '3', '4', '5', '6'),
                charArrayOf('2', '1', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '4', '2')
            ),
        ),
        expectedResult = false
    )
    //valid sudoku board
    test(
        title = "Valid complete sudoku board test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
                charArrayOf('2', '1', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '4', '2')
            ),
        ),
        expectedResult = true
    )
    test(
        title = "Valid incomplete sudoku board test case",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '-', '8', '9'),
                charArrayOf('-', '5', '6', '7', '-', '9', '1', '2', '3'),
                charArrayOf('7', '8', '9', '-', '2', '3', '4', '5', '6'),
                charArrayOf('2', '-', '4', '3', '6', '-', '8', '9', '7'),
                charArrayOf('3', '6', '-', '8', '9', '7', '2', '-', '4'),
                charArrayOf('8', '9', '7', '2', '-', '4', '3', '6', '5'),
                charArrayOf('5', '3', '-', '6', '4', '2', '9', '-', '8'),
                charArrayOf('6', '-', '2', '9', '7', '-', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '-', '2')
            ),
        ),
        expectedResult = true
    )
}



fun test(
    title: String,
    result: Boolean,
    expectedResult: Boolean
){
    if(result == expectedResult){
        println("Success: $title")
    } else {
        println("Failure: $title")
    }
}