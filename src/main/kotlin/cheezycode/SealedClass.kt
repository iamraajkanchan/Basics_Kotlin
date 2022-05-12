package cheezycode

fun main() {
    var redTile: Red = Red("Red", 25)
    var blueTile: Blue = Blue("Blue", points = 20)
    println("${redTile.type} - ${redTile.points}")

    var tile: Tile = Red("Red", 10)
    var points = when (tile) {
        is Blue -> tile.points * 5
        is Red -> tile.points * 10
    }
    println(points)
}

// Tile is an abstract class
sealed class Tile;

class Red(val type: String, val points: Int) : Tile()
class Blue(val type: String, val points: Int) : Tile()