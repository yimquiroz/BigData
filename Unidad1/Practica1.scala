//1.Desarrollar un algoritmo en scala que calcule el radio de un círculo
val a =3
    val r = math.sqrt(a/math.Pi)
//2. Desarrollar un algoritmo en scala que me diga si un número es primo
   
def numeroprimo(n :Int) : Boolean =
    {
    if (n <= 1)
    false
    else if (n==2)
    true
    else
    !(2 to (n-1)).exists(x=> n % x==0)
}
//3. Dada la variable bird = "tweet", utiliza interpolación de string para
// imprimir "Estoy escribiendo un tweet"

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la // secuencia "Luke"
//5. ¿Cuál es la diferencia entre value y una variable en scala?
//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el número 3.1416 