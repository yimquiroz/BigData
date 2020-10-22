<b>//1-.We perform an algorithm to calculate the radius of a circle 
val a =3
    val r = math.sqrt(a/math.Pi)
//2. We perform an algorithm to determine if a number is a prime
   def num_primo(n :Int) : Boolean =
    {
    if (n <= 1)
    false
    else if (n==2)
    true
    else
    !(2 to (n-1)).exists(x=> n % x==0)
}
//3. Given the variable bird="tweet" ,use string interpolation to print "I am writing a tweet "n
var bird = "tweet"
println ("Estoy escribiendo un " + bird)
//4. Given the variable message = "Hello Luke, I am your father!" use slilce to extract the sequence "Luke"
var mensaje= "Hola Luke yo soy tu padre!" 
mensaje slice (5,9)
//5. What is the difference between value and a variable in scala?
val noMutable = 3.1416 
var Mutable = "Hello world!"
//6. Given the tuple (2,4,5,1,2,3,3.1416,23) returns the number 3.1416
val tupla=(2,4,5,1,2,3,3.1416,232)
println(tupla._7)
