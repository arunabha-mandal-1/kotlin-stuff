fun main() {
    // <Int>
    var numbers = arrayOf<Int>()

    val footballPlayer1 = FootballPlayer("Football Player 1")
    val footballPlayer2 = FootballPlayer("Football Player 2")

    val baseballPlayer1 = BaseballPlayer("Baseball Player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball Player 2")

    val footballTeam = Team<FootballPlayer>("Football Team", mutableListOf(footballPlayer1))
    footballTeam.addPlayers(footballPlayer2)

//    footballTeam.addPlayers(baseballPlayer2) // error

    val baseballTeam = Team("Baseball Team", mutableListOf(baseballPlayer1))
    baseballTeam.addPlayers(baseballPlayer2)

//    baseballTeam.addPlayers(footballPlayer2) // error

    // Error, cuz we set upper bound, it must be inherited from Player class
//    val gamesTeam = Team<GamesPlayer>("Games Team", mutableListOf())

}

/*
* Generics : Give compiler a hint about what kind of object we are dealing with.
*            This help compiler to figure out some error at the compile time.
*            It also helps us to write more consistent and better code.
*            Mainly used with collections.
* */

// Also we can add upperbound in generics and we restrict that this T needs to inherit from Player class.
class Team<T: Player>(val name: String, val players: MutableList<T>){
    // We use generics so that we don't have to create class for every team.
    fun addPlayers(player: T){
        if(players.contains(player)){
            println("Player ${(player as Player).name} is already in the team ${this.name}.")
        }else{
            players.add(player)

            // player.name will work only if we set upper bound, and we don't need to do casting
            println("Player ${player.name} was added in the team ${this.name}.")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)
class GamesPlayer(name: String)