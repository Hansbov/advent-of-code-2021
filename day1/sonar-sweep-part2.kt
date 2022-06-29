package day1

import java.io.File

fun main() {

    var array: Array<Int> = emptyArray()

    File("./day1/depthMeasurements.txt").forEachLine { array = array.plus(it.toInt()) }

    var i: Int = 0
    var counter: Int = 0
    while (array.lastIndex >= i + 3) {
        if ((array[i] + array[i + 1] + array[i + 2]) < (array[i + 1] + array[i + 2] + array[i + 3])) {
            counter += 1
        }
        i += 1
    }

    println("number of increases: $counter")
}
