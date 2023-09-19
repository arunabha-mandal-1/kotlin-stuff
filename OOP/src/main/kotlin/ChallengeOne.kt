fun main() {
    // Mutable list can be inlined
    // Arraylist cannot be inlined

    val account = Account("Arunabha")
    account.deposit(5000)
    account.deposit(1000)
    account.withdraw(500)
    account.deposit(-800)
    account.withdraw(-1000)

    val balance = account.calculateBalance()
    println("Balance: $balance")
    account.displayTransactions()
}

/*
* Bank a/c of a person consisting name, balance, transaction properties
* , and methods deposit and withdraw with check
* */

class Account(val accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            this.balance += amount
            println("$amount deposited. Balance is now ${this.balance}.")
        }else {
            println("Cannot deposit negative sums.")
        }
    }

    fun withdraw(withdrawl: Int) {
        if(-withdrawl < 0) {
            transactions.add(-withdrawl)
            this.balance += -withdrawl
            println("$withdrawl debited. Balance is now ${this.balance}.")
        }else {
            println("Cannot withdraw negative sum.")
        }
    }

//    fun calculateBalance() = this.balance
    fun calculateBalance(): Int {
        this.balance = 0
        for(transaction in transactions){
            this.balance += transaction
        }
        return this.balance
    }

    fun displayTransactions(){
        for(transaction in transactions) {
            if(transaction < 0){
                println("Withdrawn: ${transaction}")
            }else{
                println("Deposited: ${transaction}")
            }
        }
    }
}