//practice 3

//1. Declare a List called listEvens made up of Integers and return a String.
def listEvens(list:List[Int]): String ={
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
    for(n <- list){
        if(n==7){
            res = res + 14
        }else{
            res = res + n
        }
    }
    return res
}
val af= List(1,7,7)
println(afortunado(af))


def balance(list:List[Int]): Boolean={
    var primera = 0
    var segunda = 0

    segunda = list.sum

    for(i <- Range(0,list.length)){
        primera = primera + list(i)
        segunda = segunda - list(i)

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

def palindromo(palabra:String):Boolean ={
    return (palabra == palabra.reverse)
}

val palabra = "OSO"
val palabra2 = "ANNA"
val palabra3 = "JUAN"

println(palindromo(palabra))
println(palindromo(palabra2))
println(palindromo(palabra3))

