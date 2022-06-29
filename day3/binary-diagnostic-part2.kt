package day3

import java.io.File

fun main() {

    var array: Array<Array<Int>> = emptyArray()
    var list: List<String> = emptyList()

    File("./day3/diagnosticReport.txt").forEachLine {
        var v: Array<Int> = emptyArray()
        it.toCharArray().forEach { char -> v = v.plus(char.toString().toInt()) }
        array = array.plus(v)
    }

    var i = 0
    while (i < 12) {
        if (array.size == 1)
            break
        var one = 0
        var zero = 0
        array.forEach { ar ->
            if (ar[i] == 0)
                zero++
            else
                one++
        }
        var result = one.compareTo(zero)
        when (result) {
            0 -> result = 1
            1 -> result = 1
            -1 -> result = 0
        }

        var place = 0
        array.forEach {
            if (it[i] != result)
                array.drop(place)
            place++
        }
        i++
    }

    var oxygenGeneratorRating = ""
    array[0].forEach { oxygenGeneratorRating = oxygenGeneratorRating.plus(it) }

    println(oxygenGeneratorRating.toInt(2))
}
