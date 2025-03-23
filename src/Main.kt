/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   OLD GOLD
 * Project Author: POLLY HYDE
 * GitHub Repo:    https://github.com/waimea-pahyde/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * This is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.
 *
 * =====================================================================
 */





//main game loop:
//show the game
//ask the player their move
//Use the move (update the game state)
//Check if they've won
//Switch to next player
//continue (but for player 2)

//Player Move:
//Get which token the player wants to move
//Get how many squares the token can move it
//Check is the Square is empty
//Move the token
//OR Check if the player wants to remove the Token from the board, only if it's in the last square.
//If the gold coint is in the last square, let the player know they've won.


/**
 * CHECKS:
 * Are instructions there?
 *
 * Is there a collection?
 *
 * Players can give turns?
 *
 * Are there two variables?
 *
 * The game prints after every move?
 *
 * Multiple functions?
 *
 * Is the game playable?
 * The winner is shown?
 * Can two people play?
 * Player names are there?
 */
const val NUMSQUARES = 20 //20 SQUARES
const val EMPTY = "   "
const val SILVERCOINS = 5
const val GOLDCOINS = 1


fun main() { //Main Game

    //WELCOME / SHOW INSTUCTIONS
    println("WELCOME TO OLD GOLD!!")
    println("=====================")
    println()

    println("How to play:")
    println("dump the instructions here CHANGE THIS LATER")

    var board = setupBoard()
    showBoard(board)

    println()
    println("Creating the board...")

    val withCoin = addCoins(board)
    showBoard(withCoin)


}

//setup game :

//Grab the silver coins (5)
//grab the gold coin (1)
//Place the coins on the grid (at random spots)
// show the grid with the coins



fun setupBoard(): MutableList<String> { //not done, needs return function
    val squareList = mutableListOf<String>()
    for (i in 1..NUMSQUARES) squareList.add(EMPTY)
    return squareList

}
//Drawing the board - Create a grid for the coins to play on (and show it) (20 squares)
fun showBoard(squareList: MutableList<String>) {
    println()
    for (i in squareList.indices) { //top row of boxes
        print("┌────────")
    }
    print("┬")

    println()
    for ((i, squareNum ) in squareList.withIndex()) {
        print("| ${squareNum.padEnd( 7 , ' ')}")

    }
    print("|")
    println()
    for (i in squareList.indices) {
        print("┴────────")


}}

fun addCoins(squareList: MutableList<String>): MutableList<String> {
    println("I'm using add coins")
    for (i in 0..SILVERCOINS) {

        println("I'm in the for loop")
        // get a random item
        //get the index of that item
        //replace it with a silver coin
        var coinPlace = squareList.indexOf(squareList.random(System.currentTimeMillis()))
        println("Yep I got the index of $coinPlace")


        println("I assigned a value to coin place, which is $coinPlace")



        squareList[coinPlace.toInt()] = "SILVERCOIN"

        println("I added silver coins")
    }
    return squareList

//Grab the silver coins (5)
//grab the gold coin (1)
//Place the coins on the grid (at random spots)
// show the grid with the coins
}



