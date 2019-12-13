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

        //val numero = response?.toInt()

        when(response){
            "1" -> {
                receta = ""
                do {
                    val menu2 = """
                    :: Ingredientes ::
                    
                    
                    Selecciona la opción deseada
                    1. Agua
                    2. Leche
                    3. Carne
                    4. Verduras
                    5. Frutas
                    6. Cereal
                    7. Huevos
                    8. Aceite
                    9. Regresar
                """.trimIndent()
                    println(menu2)
                    val response2:String? = readLine()

                    when(response2){
                        "1" -> receta += "Agua, "
                        "2" -> receta += "Leche, "
                        "3" -> receta += "Carne, "
                        "4" -> receta += "Verduras, "
                        "5" -> receta += "Frutas, "
                        "6" -> receta += "Cereal, "
                        "7" -> receta += "Huevos, "
                        "8" -> receta += "Aceite, "
                        "9" -> continue@menuprincipal
                        else -> println("Solo del 1 al 9")
                    }
                }while(response2 != "9")
            }
            "2" -> println("receta: $receta")
            "3" -> break@menuprincipal
            else -> println("Solo 1, 2, 3")
        }
    }while(response != "3")


}