package day2

import java.io.File


// this is a comment
fun main() {
    var horizontal: Int = 0
    var depth: Int = 0
    var aim: Int = 0
    File("./day2/plannedCourse.txt").forEachLine {
        with(it) {
            when {
                contains("forward") -> {
                    val value: Int = it.slice(8..8).toInt()
                    horizontal += value
                    depth += aim * value
                }
                contains("down") -> aim += it.slice(5..5).toInt()
                contains("up") -> aim -= it.slice(3..3).toInt()
            }
        }
    }

    println("Depth: $depth \nHorizontal: $horizontal \nHorizontal x Depth = ${horizontal * depth}")
}
