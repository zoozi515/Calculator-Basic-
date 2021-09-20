fun main() {
    fun valid_input() : Int{
        try {
            val num = readLine()!!.toInt()
            return num
        } catch (e: Exception){
            return 0
        }
    }

    fun sum(num1: Int, num2: Int) : Int{
        val sum = num1 + num2
        return sum
    }

    while(true){
        print("\nEnter your first number: ")
        val number1 =valid_input()

        print("Enter your second number: ")
        val number2 = valid_input()

        val result = sum(number1, number2)
        print("$number1 + $number2 = $result\n")

        print("Would you like to add more numbers? (Y/N) >> ")
        val c = readLine()
        if (c == "N" || c == "n")
            break
    }


}