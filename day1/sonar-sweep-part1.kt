package day1

import java.io.File

fun main() {

    println("Counting...")

    var previousDepth = 0
    var counter = -1
    File("./day1/depthMeasurements.txt").forEachLine {
        val depth = it.toInt()
        if (depth > previousDepth) {
            counter += 1
            println("$depth > $previousDepth")
        }

        previousDepth = depth
    }

    println("The number of tines a depth measurement increases is: $counter")
}
