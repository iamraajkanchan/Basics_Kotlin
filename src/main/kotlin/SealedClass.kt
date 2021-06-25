fun main() {
    var redTile: Red = Red("Red,", 25)
    var blueTile: Blue = Blue("Blue", points = 20)

    

}

sealed class Tile;

class Red(val type: String, val points: Int) : Tile()
class Blue (val type: String, val points: Int) : Tile()