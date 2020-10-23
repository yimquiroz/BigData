//practice 3

//1. Declare a List called listEvens made up of Integers and return a String.
<b>def listEvens(list:List[Int]): String ={
//2.In a for loop as long as the value is less than the list
    for(n <- list){
        //3.If the remainder of N is equal to 0, it will print that the number in the list is even
        if(n%2==0){
            println(s"$n is even")
            //4.If the remainder of N is different from 0, it will print that the number in the list is printed.
        }else{
            println(s"$n is odd")
        }
    }
    //5.The answer is done
    return "Done"
}
val l = List(1,2,3,4,5,6,7,8)
val l2 = List(4,3,22,55,7,8)
listEvens(l)
listEvens(l2)

//1.A list named "afortunado" is declared made up of integers as well as its return

def afortunado(list:List[Int]): Int={
    //2.Variable called res is generated, assigning it an initial value of 0
    var res=0
    //3.In a for loop as long as the value of n is less than the list
    for(n <- list){
        //If n is equal to 7 this will print the value of the operation of res + 14
        if(n==7){
            res = res + 14
        }
        //If not it will print the value of res + n
        else{
            res = res + n
        }
    }//return res
    return res
}
val af= List(1,7,7)
//
println(afortunado(af))

//1. A function called balance is declared that will have as a parameter a List made up of
// Integers and returns a Boolea
def balance(list:List[Int]): Boolean={
    //2. The first and second variables are declared with value 0.
    var primera = 0
    var segunda = 0
//3. The sum of the entire List is assigned to the second variable.
    segunda = list.sum
//4. In a for loop with a range from 0 to the length of the list, a summation
//of the values ​​in the list and the secondary variable proceed to be subtracted
 is declared in the primary variable 
    for(i <- Range(0,list.length)){
        primera = primera + list(i)
        segunda = segunda - list(i)
//5. At the last of this, if the first and second variables turn out to be equal, the function returns a True.*/
        if(primera == segunda){
            return true
        }
    }
    return false 
}
val bl = List(3,2,1)
val bl2 = List(2,3,3,2)
val bl3 = List(10,30,90)

balance(bl)
balance(bl2)
balance(bl3)
n.






//1.A list named "palindromo" is declared made up of string as well as its return boolean
def palindromo(palabra:String):Boolean ={
    //It will return the result of comparing the word value with the same but in reverse 
    //(to check if it is palindrome or not)
    return (palabra == palabra.reverse)
}

val palabra = "OSO"
val palabra2 = "ANNA"
val palabra3 = "JUAN"

//3. When sending to print the result of the function with the word value as a parameter, this will return a Boolean,
//True if this is palindrome (that is, if the word value is equal to itself in reverse) or 
//a False if it is not palindrome
println(palindromo(palabra))
println(palindromo(palabra2))
println(palindromo(palabra3))