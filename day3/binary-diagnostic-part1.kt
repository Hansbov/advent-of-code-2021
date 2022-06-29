package day3

import java.io.File

fun main() {

    var gammaRate = "000000000000"
    var list: List<String> = emptyList()

    File("./day3/diagnosticReport.txt").forEachLine {
        list = list.plus(it)
    }

    var i = 0
    while (i < 12) {
        var one = 0
        var zero = 0
        list.forEach { value ->
            if (value.substring(i..i).toInt() == 1)
                one++
            else
                zero++
        }
        gammaRate = when (one > zero) {
            true -> gammaRate.replaceRange(i..i, "1")
            false -> gammaRate.replaceRange(i..i, "0")
        }

        i++
    }

    val gamma = gammaRate.toInt(2)
    gammaRate = gammaRate.replace("0", "2")
        .replace("1", "0")
        .replace("2", "1")
    val epsilon = gammaRate.toInt(2)

    println(" Gamma rate = $gamma, Epsilon rate = $epsilon\n Power Consumption = ${gamma * epsilon}")
}
