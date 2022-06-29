package day2

import java.io.File

fun main() {
    var horizontal: Int = 0
    var depth: Int = 0
    File("./day2/plannedCourse.txt").forEachLine {
        with(it) {
            when {
                contains("forward") -> horizontal += it.slice(8..8).toInt()
                contains("down") -> depth += it.slice(5..5).toInt()
                contains("up") -> depth -= it.slice(3..3).toInt()
            }
        }
    }

    println("Depth: $depth \nHorizontal: $horizontal \nHorizontal x Depth = ${horizontal * depth}")
}
