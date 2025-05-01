import kotlin.random.Random
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

const val NUMSQUARES = 20 //20 SQUARES
const val EMPTY = "   "
const val SILVERCOINS = 5

//Main Game Loop
/**
 * Prints the title and instructions
 * Gets and sets the player name variables
 * Calls the functions to set up the board
 * Starts the game loop (further clarified in the function)
 */
fun main() {

    //Titles, heading and instructions
    println(" \$\$\$\$\$\$\\ \$\$\\      \$\$\$\$\$\$\$\\         \$\$\$\$\$\$\\  \$\$\$\$\$\$\\ \$\$\\      \$\$\$\$\$\$\$\\  \n" +
            "\$\$  __\$\$\\\$\$ |     \$\$  __\$\$\\       \$\$  __\$\$\\\$\$  __\$\$\\\$\$ |     \$\$  __\$\$\\ \n" +
            "\$\$ /  \$\$ \$\$ |     \$\$ |  \$\$ |      \$\$ /  \\__\$\$ /  \$\$ \$\$ |     \$\$ |  \$\$ |\n" +
            "\$\$ |  \$\$ \$\$ |     \$\$ |  \$\$ |      \$\$ |\$\$\$\$\\\$\$ |  \$\$ \$\$ |     \$\$ |  \$\$ |\n" +
            "\$\$ |  \$\$ \$\$ |     \$\$ |  \$\$ |      \$\$ |\\_\$\$ \$\$ |  \$\$ \$\$ |     \$\$ |  \$\$ |\n" +
            "\$\$ |  \$\$ \$\$ |     \$\$ |  \$\$ |      \$\$ |  \$\$ \$\$ |  \$\$ \$\$ |     \$\$ |  \$\$ |\n" +
            " \$\$\$\$\$\$  \$\$\$\$\$\$\$\$\\\$\$\$\$\$\$\$  |      \\\$\$\$\$\$\$  |\$\$\$\$\$\$  \$\$\$\$\$\$\$\$\\\$\$\$\$\$\$\$  |\n" +
            " \\______/\\________\\_______/        \\______/ \\______/\\________\\_______/ \n" +
            "                                                                     ")
    println("  ‧₊ ˚  ⊹ ࣭ ⭑ . ₊ ⊹ .₊๋  ‧₊ ˚  ⊹ ࣭ ⭑ . ₊ ⊹ .₊๋")
    println()

    println("\uD835\uDE43\uD835\uDE64\uD835\uDE6C \uD835\uDE4F\uD835\uDE64 \uD835\uDE4B\uD835\uDE61\uD835\uDE56\uD835\uDE6E:")
    println("\uD835\uDE4B\uD835\uDE61\uD835\uDE56\uD835\uDE6E\uD835\uDE5A\uD835\uDE67\uD835\uDE68 \uD835\uDE64\uD835\uDE63\uD835\uDE5A \uD835\uDE56\uD835\uDE63\uD835\uDE59 \uD835\uDE69\uD835\uDE6C\uD835\uDE64 \uD835\uDE69\uD835\uDE56\uD835\uDE60\uD835\uDE5A \uD835\uDE69\uD835\uDE6A\uD835\uDE67\uD835\uDE63\uD835\uDE68 \uD835\uDE69\uD835\uDE64 \uD835\uDE5A\uD835\uDE5E\uD835\uDE69\uD835\uDE5D\uD835\uDE5A\uD835\uDE67 \uD835\uDE62\uD835\uDE64\uD835\uDE6B\uD835\uDE5A \uD835\uDE64\uD835\uDE67 \uD835\uDE67\uD835\uDE5A\uD835\uDE62\uD835\uDE64\uD835\uDE6B\uD835\uDE5A \uD835\uDE58\uD835\uDE64\uD835\uDE5E\uD835\uDE63\uD835\uDE68 \uD835\uDE5B\uD835\uDE67\uD835\uDE64\uD835\uDE62 \uD835\uDE69\uD835\uDE5D\uD835\uDE5A \uD835\uDE57\uD835\uDE64\uD835\uDE56\uD835\uDE67\uD835\uDE59! \uD835\uDE4F\uD835\uDE5D\uD835\uDE5A \uD835\uDE65\uD835\uDE61\uD835\uDE56\uD835\uDE6E\uD835\uDE5A\uD835\uDE67 \uD835\uDE69\uD835\uDE5D\uD835\uDE56\uD835\uDE69 \uD835\uDE67\uD835\uDE5A\uD835\uDE62\uD835\uDE64\uD835\uDE6B\uD835\uDE5A\uD835\uDE68 \uD835\uDE69\uD835\uDE5D\uD835\uDE5A \uD835\uDE5C\uD835\uDE64\uD835\uDE61\uD835\uDE59 \uD835\uDE58\uD835\uDE64\uD835\uDE5E\uD835\uDE63 \uD835\uDE6C\uD835\uDE5E\uD835\uDE63\uD835\uDE68!")



    //sets the player turn count to 1
    var playerTurnCount = 1

    //Getting player names. If it's blank, assign the default.
    println("PLAYER 1! What's your name?")
    var player1 = readln()
    if (player1.isBlank()) {
        player1 = "Player 1"}

    println("Player 2, what's your name?")
    var player2 = readln()
    if (player2.isBlank()) {
        player2 = "Player 2"
    }


    var currentPlayer = ""
    currentPlayer = playerTurn(player1, player2, playerTurnCount)


    //Calls function to set up the board
    val board = setupBoard()
    showBoard(board)
    println()
    println("Creating the board...")

    //Adds the coins to the board
    val withCoin = addCoins(board)
    showBoard(withCoin)

    var moveCount = 0



    /**
     * ====================
     * THE GAME LOOP
     *  - ASKS PLAYER 1 TO TAKE A TURN
     *  - IF THERE'S A COIN IN THE LAST SPACE, REMOVE SHOULD BE AN OPTION
     *  - IF THERE'S NOT, ASK THEM TO PICK A COIN
     *  - ASK WHAT THEY WANT TO DO WITH THE COIN
     *  SWITCH TO PLAYER 2
     *  ===================
     */

    while (true) {
        playerTurnCount++
        playerTurn(player1 , player2, playerTurnCount)

        if (board[0] != EMPTY) {
            println("Would you like to remove a coin or move a coin?")
            println("[R] to remove a coin")
            println("[M] to move a coin")
            val playerMove = readln().uppercase()
            when (playerMove) {
                'M'.toString() -> coinMove(board)
                'R'.toString() -> coinRemove(board)
            }
        }

        else {
            coinMove(board)
            }

        moveCount++

        if (!winCheck(board)) {
            println()
            println("Congratulations! $currentPlayer wins!")
            println("You took ${moveCount} turns!")
            break
        }

    }
}

/**
 * Setup Board Function -
 * - creates a mutable list named squareList, which for simplicity reasons is later renamed in the main function as 'board'
 * - makes every slot in each square
 */
fun setupBoard(): MutableList<String> {
    val squareList = mutableListOf<String>()
    for (i in 1..NUMSQUARES) squareList.add(EMPTY)
    return squareList

}

/**
 * Show Board function
 * - Draws the grid
 * - Prints the coins in the grid.
 */
fun showBoard(squareList: MutableList<String>) {
    println()
    for (i in squareList.indices) { //top row of boxes
        print("┌────────")
    }
    print("┬")

    println()
    for ((i, squareNum) in squareList.withIndex()) {
        print("| ${squareNum.padEnd( 7 , ' ')}")

    }
    print("|")
    println()
    for (i in squareList.indices) {
        print("┴────────")
    }
    


    }

/**
 * Add coins function:
 * Get a random amount of coins
 * For each coin on the board, check if the square is empty before placing.
 * place them on random places on the board
 */
fun addCoins(squareList: MutableList<String>): MutableList<String> {

    for (i in 0..SILVERCOINS) {

        val coinPlace = Random.nextInt(1, NUMSQUARES)

        if (squareList[coinPlace] == EMPTY) {
            squareList[coinPlace] = "SILV"

        } else continue

        //println("I added silver coins")
    }
    var coinPlaceGold = Random.nextInt(1, NUMSQUARES)
    if (squareList[coinPlaceGold] == EMPTY) {
        squareList[coinPlaceGold] = "GOLD"
    }
    else {
        var coinPlaceGold = Random.nextInt(1, NUMSQUARES)
        squareList[coinPlaceGold] = "GOLD"
    }

    return squareList
}

/**
 * Player Turn
 * Gets the player names defined above
 * Gets Player Turn Count, also as defined above.
 * Each loop of the main loop, the player turn count get +1 added onto it.
 * If the playerturnCount, when divided by two, is equal to zero, then it's player 1's turn.
 * Thus, checking if an even or odd number.
 *
 *
 */
fun playerTurn(player1: String, player2: String, playerTurnCount: Int): String {
    println()
    return if (playerTurnCount % 2 == 0) {
        println("$player1's turn!")
        player1 }
    else {
        println("$player2's turn!")
        player2
    }
}

/**
 * FUNCTION TO MOVE COINS
 * =============================
 * - ask the user what coin they want to move
 * - get the number
 * - get the index of that number and check if it's not empty
 * - if it is empty, tell tehm there isn't a coin there
 * - ask them where they want to move the coin.
 * - check if it's empty
 * for squares in square jump, if square != empty, call 'thats not empty'
 * if no squares are not empty move the coin there
 *
 */
fun coinMove(board: MutableList<String>) { //The function to move coins


    println("Which coin would you like to move?")

    var movedCoin: Int?
    var coinType = "blank"

    while (true) {

        //The coin they want to move
        movedCoin = readln().toIntOrNull()

        //Checking different things, so no when statement.




        if (movedCoin == null) {
            println("Please ENTER A NUMBER!")
            continue
        }
        if (movedCoin <= 0 || movedCoin > NUMSQUARES) {
            println("Please pick a coin to move!")
            continue
        }

        when (board[movedCoin - 1]) {
            EMPTY -> {
                println("Please choose a coin!")
                continue
            }

            "SILV" -> {
                coinType = "SILV"
            }

            "GOLD" -> {
                coinType = "GOLD"
            }
        }

        //If they pick a square that's too big or too small



        //If there's a coin directly next to this one to the left, ergo nowhere to move it.
        if (movedCoin - 2 < 0 || board[movedCoin - 2] != EMPTY) {
                println("There's nowhere to move this coin!")
                continue
            }


        break }


    while (true) {

        println("Where would you like to move your coin to?")

        //The square they want to move their coin to.
        val moveSquare = readln().toIntOrNull()

       if (moveSquare == null) {
           println("Please choose a square!")
           continue
        }

        //If they pick a square thats too big or small.
        if (moveSquare <= 0 || moveSquare >= NUMSQUARES) {
            println("Please pick a square to move!")
            continue
        }


        // Boolean Function that checks if they've jumped coins or not.
        validMove(board, moveSquare, movedCoin!!)
        //If the boolean returns false
        if (!validMove(board, moveSquare, movedCoin)) {
            println("You can't jump coins!")
            continue
        }




        //If they square they chose wasn't empty
        if (board[moveSquare-1] != EMPTY) {
            println("There is already a coin in this square!!")
            continue
        }


        //If the square they chose to move to was behind the original coin.
        if (moveSquare >= movedCoin) {
            println("You can't move your coin backwards!")
            continue
        }

        //Make the square where their coin used to be empty.
        board.set(movedCoin-1 , EMPTY )


        //Set where their coin is now to the original coin type, chosen above.
        board.set(moveSquare-1 ,  coinType)
        showBoard(board)
        println()
        println("Successfully moved coin!!")

        break

    }


        
    }

/**
 * VALID MOVE FUNCTION:
 *  Simple boolean function to check if each square between the move square and the move coin is empty.
 */
fun validMove(board: MutableList<String> , moveSquare: Int , movedCoin: Int): Boolean {
    for (square in moveSquare+1..movedCoin-1) {
        if (board[square-1] != EMPTY) {
            return false
        }
    }
    return true
}

/**
 * Coin Remove:
 * If the user chooses to remove a coin in the main function, this function is called.
 * Removes the coin at 0
 * prints a line, then shows the board.
 */
fun coinRemove(board: MutableList<String>) {
    board[0] = EMPTY
    println("You removed a coin!")
    showBoard(board)
}

/**
 * winCheck:
 * Checks if the mutable list contains a gold coin.
 * If there is a gold coin, returns 'true'
 * Otherwise it returns false, signilling that the game is over.
 */
fun winCheck(board: MutableList<String>): Boolean {
    if (board.contains("GOLD")) {
        return true
    }
    return false

}