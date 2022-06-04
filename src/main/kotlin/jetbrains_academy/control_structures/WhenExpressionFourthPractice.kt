package jetbrains_academy.control_structures

const val GAME_NO_ARMY_CATEGORY = "no army"
const val GAME_FEW_CATEGORY = "few"
const val GAME_SEVERAL_CATEGORY = "several"
const val GAME_PACK_CATEGORY = "pack"
const val GAME_LOTS_CATEGORY = "lots"
const val GAME_HORDE_CATEGORY = "horde"
const val GAME_THRONG_CATEGORY = "throng"
const val GAME_SWARM_CATEGORY = "swarm"
const val GAME_ZOUNDS_CATEGORY = "zounds"
const val GAME_LEGION_CATEGORY = "legion"
fun main() {
    val unit = readln().toInt()
    val printCategory = when {
        unit < 1 -> GAME_NO_ARMY_CATEGORY
        unit in 1..4 -> GAME_FEW_CATEGORY
        unit in 5..9 -> GAME_SEVERAL_CATEGORY
        unit in 10..19 -> GAME_PACK_CATEGORY
        unit in 20..49 -> GAME_LOTS_CATEGORY
        unit in 50..99 -> GAME_HORDE_CATEGORY
        unit in 100..249 -> GAME_THRONG_CATEGORY
        unit in 250..499 -> GAME_SWARM_CATEGORY
        unit in 500..999 -> GAME_ZOUNDS_CATEGORY
        else -> GAME_LEGION_CATEGORY
    }
    println(printCategory)
}