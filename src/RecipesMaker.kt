fun main() {

    var receta = ""
    menuprincipal@do {
        val menu = """
            :: Bienvemido a Recipe Maker ::
            
            
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()

        println(menu)

        val response:String? = readLine()

        when(response){
            "1" -> receta = makeRecipe()
            "2" -> viewRecipe(receta)
            "3" -> break@menuprincipal
            else -> println("Solo 1, 2, 3")
        }
    }while(response != "3")
}

fun makeRecipe():String{
    var recipe = ""
    do {
        val menu2 = """
                    Hacer receta
                    Selecciona por categoría el ingrediente que buscas
                    1. Agua
                    2. Leche
                    3. Carne
                    4. Verduras
                    5. Frutas
                    6. Cereal
                    7. Huevos
                    8. Aceites
                    9. Regresar
                """.trimIndent()
        println(menu2)
        val response2:String? = readLine()
        when(response2){
            "1" -> recipe += "Agua, "
            "2" -> recipe += "Leche, "
            "3" -> recipe += "Carne, "
            "4" -> recipe += "Verduras, "
            "5" -> recipe += "Frutas, "
            "6" -> recipe += "Cereal, "
            "7" -> recipe += "Huevos, "
            "8" -> recipe += "Aceites, "
            else -> println("Solo del 1 al 9")
        }
    }while(response2 != "9")
    return recipe
}

fun viewRecipe(receta: String){
    println("receta: $receta")
}