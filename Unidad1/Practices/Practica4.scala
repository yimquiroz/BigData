
//Function has int parameter that returns int
def fibo1(n: Int): Int = {
    if(n<2)//if n is less than 2 returns n
    {
        return n 
    }
    else  // else return operation
        {
            return fibonacci (n-1) + fibonacci (n-2)
        }
}

//Import 
import scala.math.sqrt
//Function has int parameter that returns double
def fibo2(n:Int) : Double = { 
    if(n<2) { //if n is less than 2 returns n
        return n 
    }
    else {  // else return operation
        return ((1/math.sqrt(5)) * math.pow(((1+math.sqrt(5))/2), n) + (1/2))
              
    }
}


import scala.math.sqrt
//Function has int parameter that returns BigInt
def fibo3(n: Int): BigInt = {
    if(n<2) //if n is less than 2 returns n
    {
        return n
    }
    else //Else, return the result of the operations given by raising them to the value n
    {
        var varphi = (1+sqrt(5))/2
        var j=((math.pow(varphi,n))-(1-varphi))/sqrt(5)
        return Math.round(j) 
    }
    }

//In this cycle, different values ​​are assigned when performing each iteration,
 //because there is an addition operation on one variable and a subtraction 
 //operation on the other variable, in this way the fibonacci number is obtained in the variable a
    def fibo4(n: Int){
    var a:Int =0
    var b:Int =1

    for(k:Int <- Range(0,n))
    {
        b = b + a
        a = b - a

        print(s"$a ")
    }
}

/*Finally, it uses a vector to carry out the route after adding the values, 
the for loop is also used to add the previous positions of the values ​​as 
well as another result is obtained.*/

def fibo5(n: Int) = {
    if (n<2)
    {
     println(n)
    }
    else
    {
        val vector = Array.range(0, n+1)
        vector (0) = 0
        vector (1) = 1
        for (k <- 2 to n)
        {
            vector(k) = vector(k-1) + vector(k-2)
        }
         println(vector.mkString(" "))
    }
}