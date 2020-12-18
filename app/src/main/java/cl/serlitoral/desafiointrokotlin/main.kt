package cl.serlitoral.desafiointrokotlin

fun main() {
    //3. Imprimir nombre
    println("Patrigio Garcia")

    //Declarar 3 variables numéricas con los valores “10”, “20” y “30”.
    val number1 = 10
    val number2 = 20
    val number3 = 30
    var result = number1 + number2 + number3

    //5. Imprimir la suma de las 3 variables.
    println("La suma de los valores es de $result")

    //6. Declarar 1 variable String y otra variable Char
    //7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char.
    val name2 = "Arataka Reigen"
    var letter = 'A'


    //8. Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable
    //char a otro valor distinto
    println("La cantidad de caracteres que posee varString es de ${name2.length}")
    letter = 'B'

    //9. Declarar una variable de tipo Float de forma explícita
    var floatNumber : Float

    //10. Asignar un valor a la variable Float
    floatNumber = 10.2F

    //11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short
    println("Los valores máximos para Byte:${Byte.MAX_VALUE} y de Short: ${Short.MAX_VALUE}")

    //12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long
    println("Los valores mínimos para Byte:${Int.MAX_VALUE} y de Short: ${Long.MIN_VALUE}")

    //13. Declarar una variable Boolean con true o false e imprimir su valor
    val boolValue = true
    println("EL valor booleano de la variable es $boolValue")

    //16. Desde la función main llamar a estas dos funciones de forma correcta
    imprimiendoParametros("Mensaje Corto", "Mensaje un poco mas largo")
    val valorIVA =  obtieneIVA(100)
    println("El IVA de 100 es de : $valorIVA")
}

//14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y
//este imprime el total de caracteres de los dos parámetros
fun imprimiendoParametros(valor1: String, valor2 : String) {
    println("Total de caracteres del parametro1 es: ${valor1.length}")
    println("Total de caracteres del parametro2 es: ${valor2.length}")
}

//15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%)
fun obtieneIVA(price : Int) : Double {
    return price*0.19
}