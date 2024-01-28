package cheezycode

fun main() {
    val redTile: Red = Red("Red", 25)
    var blueTile: Blue = Blue("Blue", points = 20)
    println("${redTile.type} - ${redTile.points}")
    val tile: Tile = Blue("Red", 10)
    val points = when (tile) {
        is Blue -> tile.points * 5
        is Red -> tile.points * 10
    }
    println(points)
}

// Tile is an abstract class
sealed class Tile

class Red(val type: String, val points: Int) : Tile()
class Blue(val type: String, val points: Int) : Tile()