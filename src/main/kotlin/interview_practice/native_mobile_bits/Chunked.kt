package interview_practice.native_mobile_bits

import java.util.stream.Collectors

typealias ListOfString = List<String>
typealias SetOfString = Set<String>

class Chunked {
    companion object {
        private val catList = listOf(
            "Chinky",
            "Minky",
            "Prince",
            "Golu",
            "Nikku",
            "Bittu",
            "Nilu",
            "Tom",
            "Casie",
            "Brownie",
            "Oreo",
            "Ivy",
            "Lucky",
            "Twinkle"
        )
        private val catSet = setOf(
            "Chinky",
            "Minky",
            "Prince",
            "Golu",
            "Nikku",
            "Bittu",
            "Nilu",
            "Tom",
            "Casie",
            "Brownie",
            "Oreo",
            "Ivy",
            "Lucky",
            "Twinkle"
        )
        fun getCatList(): ListOfString = catList
        fun getCatSet() : SetOfString = catSet
    }

    fun chunkList() {
        val catPair = catList.chunked(2)
        println(catPair)
        val result =
            catPair.stream().flatMap { a -> a.stream().map { e -> "$e - Size : ${e.toCharArray().size} " } }
                .collect(Collectors.toList())
        println(result)
    }

    fun chunkSet() {
        val catPair = catSet.chunked(2)
        println(catPair)
        val catMap = mutableMapOf<String, Int>()
        catPair.stream()
            .flatMap { a -> a.stream().map { e -> catMap[e] = e.toCharArray().size } }.collect(Collectors.counting())
        for (cat in catMap.entries) {
            println("Cat Name : ${cat.key}, Cat Age : ${cat.value}")
        }
    }

    fun simulateGetOrElse() {
        val resultFromList = catList.getOrElse(15) {
            "No Cat Found"
        }
        println(resultFromList)
        val resultFromSet =  catSet.toList().getOrElse( 67) {
            "No Cat Found"
        }
        println(resultFromSet)
    }
}