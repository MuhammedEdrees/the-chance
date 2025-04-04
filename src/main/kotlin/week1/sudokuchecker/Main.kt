package org.example.week1.sudokuchecker

import kotlin.math.sqrt

fun main() {
    println("Hello, world!")
}


fun isValidSudokuBoard(
    board: Array<CharArray>,
): Boolean {
    val size = board.size
    //validate board size, if not 4, 9 or 16 return false
    if (sqrt(size.toDouble()) % 1 != 0.0) return false

    val subgridCount = sqrt(size.toDouble()).toInt()
    'c'.uppercase()
    'c'.uppercaseChar()
    //initialize row/column/subgrid matrices
    val rowSetMatrix = Array(size) { mutableSetOf<Char>() }
    val columnSetMatrix = Array(size) { mutableSetOf<Char>() }
    val subgridSetMatrix = Array(size) { mutableSetOf<Char>() }

    //set allowed chars based on size
    val allowedChars = mapBoardSizeToAllowedChars(size)

    board.forEachIndexed { rowIndex, row ->
        //check if there is any missing cells return false
        if (row.size != size) return false

        for (columnIndex in 0 until size) {
            val cell = row[columnIndex]
            if (cell == '-') continue
            if (cell !in allowedChars) return false

            //calculate the index of the subgrid based on cell rowIndex and columnIndex
            val subgridIndex = calculateSubgridIndex(
                columnIndex = columnIndex, subgridCount = subgridCount, rowIndex = rowIndex
            )

            //if char exists in the same row return false
            if (!rowSetMatrix[rowIndex].add(cell)) {
                return false
            }

            //if char exists in the same column return false
            if (!columnSetMatrix[columnIndex].add(cell)) {
                return false
            }

            //if char exists in the same subgrid return false
            if (!subgridSetMatrix[subgridIndex].add(cell)) {
                return false
            }
        }
    }
    return true
}

/**
 * @param columnIndex the column index for the cell
 * @param rowIndex the row index for the cell
 * @param subgridCount the count of sub grids in the board
 * @return returns the index of the subgrid with depending on its row index and column index
 */
fun calculateSubgridIndex(columnIndex: Int, subgridCount: Int, rowIndex: Int) =
    (columnIndex / subgridCount) + (subgridCount * (rowIndex / subgridCount))

/**
 * @param size the size of the board
 * @return returns the list of the allowed numbers as characters
 */
fun mapBoardSizeToAllowedChars(size: Int) = (1..size).map { if (it <= 9) '0' + it else 'A' + (it - 10) }

//flow chart: https://drive.google.com/file/d/1M3gVUwA5Uk584jT1PJ2gGtHRS5vfBjKu/view?usp=sharing