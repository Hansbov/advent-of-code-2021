package day1

import java.io.File

fun main() {

    var array: Array<Int> = emptyArray()

    File("./day1/depthMeasurements.txt").forEachLine { array = array.plus(it.toInt()) }

    var i: Int = 0
    var counter: Int = 0
    while (array.lastIndex >= i + 3) {
        if (addThreeValues(array, i) < addThreeValues(array, i+1)) {
            counter += 1
        }
        i += 1
    }

    println("number of increases: $counter")
}

fun addThreeValues(array: Array<Int>, i: Int): Int {
    return array[i] + array[i + 1] + array[i + 2]
}