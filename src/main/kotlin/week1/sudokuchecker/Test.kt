package week1.sudokuchecker

import org.example.week1.sudokuchecker.isValidSudokuBoard

fun main() {
    //bad input
    test(
        title = "When the board has any size that is not square number, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('2', '1', '4', '3', '6', '5'),
                charArrayOf('3', '6', '5', '8', '9', '7'),
                charArrayOf('8', '9', '7', '2', '1', '4'),
                charArrayOf('5', '3', '1', '6', '4', '2'),
                charArrayOf('6', '4', '2', '9', '7', '8'),
                charArrayOf('9', '7', '8', '5', '3', '1')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When the board is missing some cells, it should return false", result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5'),
                charArrayOf('4', '5', '6', '7', '8'),
                charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
                charArrayOf('2', '1', '4', '3', '6', '5', '8', '9', '7'),
                charArrayOf('3', '6', '5', '8', '9', '7', '2', '1', '4'),
                charArrayOf('8', '9', '7', '2', '1', '4', '3', '6', '5'),
                charArrayOf('5', '3', '1', '6', '4', '2', '9', '7', '8'),
                charArrayOf('6', '4', '2', '9', '7', '8', '5', '3', '1'),
                charArrayOf('9', '7', '8', '5', '3', '1', '6', '4', '2')
            ),
        ), expectedResult = false
    )
    test(
        title = "When there are any characters other than (1~9) or '-' for 3*3 size, it should return false",
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
        title = "When there are any characters other than (1~4) or '-' for 4*4 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '5', '3'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('2', '1', '3', '4'),
                charArrayOf('3', '4', '2', '1'),
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When there are any characters other than (1~9), (A~G) or '-' for 16*16 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                charArrayOf('5', 'Z', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
                charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
                charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

                charArrayOf('2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D'),
                charArrayOf('6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1'),
                charArrayOf('A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5'),
                charArrayOf('E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9'),

                charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
                charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
                charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
                charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

                charArrayOf('4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F'),
                charArrayOf('8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3'),
                charArrayOf('C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7'),
                charArrayOf('G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When some of the allowed letters (A-G) are lowercase for 16*16 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                charArrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
                charArrayOf('9', 'a', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
                charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

                charArrayOf('2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D'),
                charArrayOf('6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1'),
                charArrayOf('A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5'),
                charArrayOf('E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9'),

                charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
                charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
                charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
                charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

                charArrayOf('4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F'),
                charArrayOf('8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3'),
                charArrayOf('C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7'),
                charArrayOf('G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B')
            ),
        ),
        expectedResult = false
    )
    //invalid sudoku board
    test(
        title = "When there is duplication in the same row for 3*3 size, it should return false",
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
        title = "When there is duplication in the same row for 4*4 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '1', '3'),
                charArrayOf('3', '4', '-', '2'),
                charArrayOf('2', '1', '3', '4'),
                charArrayOf('3', '4', '2', '1'),
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When there is duplication in the same row for 16*16 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '1', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                charArrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
                charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
                charArrayOf('D', 'E', 'F', 'G', '-', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

                charArrayOf('2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D'),
                charArrayOf('6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1'),
                charArrayOf('A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5'),
                charArrayOf('E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9'),

                charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
                charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
                charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
                charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

                charArrayOf('4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F'),
                charArrayOf('8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3'),
                charArrayOf('C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7'),
                charArrayOf('G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When there is duplication in the same column for 3*3 size, it should return false",
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
        title = "When there is duplication in the same column for 4*4 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '4', '3'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', '-', '3', '4'),
                charArrayOf('3', '4', '2', '1'),
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When there is duplication in the same column for 16*16 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                charArrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
                charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
                charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

                charArrayOf('1', '3', '4', '-', '6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D'),
                charArrayOf('6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1'),
                charArrayOf('A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5'),
                charArrayOf('E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9'),

                charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
                charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
                charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
                charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

                charArrayOf('4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F'),
                charArrayOf('8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3'),
                charArrayOf('C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7'),
                charArrayOf('G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B')
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When there is duplication in the same subgrid for 3*3 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9'),
                charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
                charArrayOf('7', '1', '9', '-', '2', '3', '4', '5', '6'),
                charArrayOf('2', '-', '4', '3', '6', '5', '8', '9', '7'),
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
        title = "When there is duplication in the same subgrid for 4*4 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '4', '3'),
                charArrayOf('3', '1', '-', '2'),
                charArrayOf('2', '-', '3', '4'),
                charArrayOf('-', '4', '2', '1'),
            ),
        ),
        expectedResult = false
    )
    test(
        title = "When there is duplication in the same subgrid for 16*16 size, it should return false",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                charArrayOf('5', '1', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '-', '2', '3', '4'),
                charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
                charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

                charArrayOf('2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D'),
                charArrayOf('6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1'),
                charArrayOf('A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5'),
                charArrayOf('E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9'),

                charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
                charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
                charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
                charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

                charArrayOf('4', '-', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F'),
                charArrayOf('8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3'),
                charArrayOf('C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7'),
                charArrayOf('G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B')
            ),
        ),
        expectedResult = false
    )
    //valid sudoku board
    test(
        title = "When there is no duplication in the same column, row or subgrid and all characters are valid for 3*3 size," + "it should return true",
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
        title = "When there is no duplication in the same column, row or subgrid and all characters are valid for 4*4 size," + "it should return true",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '4', '3'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('2', '1', '3', '4'),
                charArrayOf('4', '3', '2', '1'),
            ),
        ),
        expectedResult = true
    )



    test(
        title = "When there is no duplication in the same column, row or subgrid and all characters are valid for 16*16 size," + "it should return true",
        result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                charArrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
                charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
                charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

                charArrayOf('2', '3', '4', '-', '6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D'),
                charArrayOf('6', '7', '8', '5', 'A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1'),
                charArrayOf('A', 'B', 'C', '9', 'E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5'),
                charArrayOf('E', 'F', 'G', 'D', '2', '3', '4', '1', '6', '7', '8', '5', 'A', 'B', 'C', '9'),

                charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
                charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
                charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
                charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

                charArrayOf('4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F'),
                charArrayOf('8', '5', '6', '7', 'C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3'),
                charArrayOf('C', '9', 'A', 'B', 'G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7'),
                charArrayOf('G', 'D', 'E', 'F', '4', '1', '2', '3', '8', '5', '6', '7', 'C', '9', 'A', 'B')
            ),
        ),
        expectedResult = true
    )
    test(
        title = "When there is some numbers and some dashes, it should return true", result = isValidSudokuBoard(
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
        ), expectedResult = true
    )
    test(
        title = "When all characters are dashes, it should return true", result = isValidSudokuBoard(
            board = arrayOf(
                charArrayOf('-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-'),
            ),
        ), expectedResult = true
    )
}


fun test(
    title: String, result: Boolean, expectedResult: Boolean
) {
    if (result == expectedResult) {
        println("Success: $title")
    } else {
        println("Failure: $title")
    }
}