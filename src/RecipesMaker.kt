import model.Alimento
import model.Receta

fun main() {
    val alimentos = arrayListOf<Alimento>()
    val receta = Receta(alimentos)
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
            "1" -> {
                alimentos.addAll(makeRecipe())
            }//receta = makeRecipe()
            "2" -> viewRecipe(receta)
            "3" -> break@menuprincipal
            else -> println("Solo 1, 2, 3")
        }
    }while(response != "3")
}

fun makeRecipe():ArrayList<Alimento>{
    //var recipe = ""
    val alimentos = arrayListOf<Alimento>()
    do {
        val menu2 = """
                    Hacer receta
                    Selecciona por categoría el ingrediente que buscas
                    1. Agua
                    2. Lacteos
                    3. Carnes, Legumbres y huevos
                    4. Verduras
                    5. Frutas
                    6. Cereal
                    7. Aceites
                    8. Regresar
                """.trimIndent()
        println(menu2)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                //recipe += "Agua, "
                val response1 = solicitarcantidad("Agua")
                val agua = response1?.let { Alimento(it, "Agua", "Agua mineral", 1) }
                if (agua != null) {
                    alimentos.add(agua)
                }
            }
            "2" -> alimentos.addAll(displayLacteos())
            "3" -> alimentos.addAll(displayCarnes())
            "4" -> alimentos.addAll(displayVerduras())
            "5" -> alimentos.addAll(displayFrutas())
            "6" -> alimentos.addAll(displayGranos())
            "7" -> alimentos.addAll(displayAceites())
            else -> println("Solo del 1 al 9")
        }
    }while(response2 != "8")
    return alimentos
}

fun viewRecipe(receta: Receta){

    println("receta: $receta")
}

fun solicitarcantidad(name: String): String? {
    println("Digite la cantidad de $name: ")
    return readLine()
}

fun displayLacteos(): ArrayList<Alimento>{
    val alimentos = arrayListOf<Alimento>()
    do {
        val menuLacteos = """
                    Selecciona el ingrediente que buscas
                    1. Leche
                    2. Queso
                    3. Yogurt
                    4. Suero
                    5. Regresar
                """.trimIndent()
        println(menuLacteos)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                val response1 = solicitarcantidad("Leche")
                val leche = response1?.let { Alimento(it, "Leche", "Leche natural", 2) }
                if (leche != null) {
                    alimentos.add(leche)
                }
            }
            "2" -> {
                val response1 = solicitarcantidad("Queso")
                val queso = response1?.let { Alimento(it, "Queso", "Queso salado", 2) }
                if (queso != null) {
                    alimentos.add(queso)
                }
            }
            "3" -> {
                val response1 = solicitarcantidad("Yogurt")
                val yogurt = response1?.let { Alimento(it, "Yogurt", "Yogurt dietetico", 2) }
                if (yogurt != null) {
                    alimentos.add(yogurt)
                }
            }
            "4" -> {
                val response1 = solicitarcantidad("Suero")
                val suero = response1?.let { Alimento(it, "Suero", "Suero costeño", 2) }
                if (suero != null) {
                    alimentos.add(suero)
                }
            }
            else -> println("Solo del 1 al 5")
        }
    }while(response2 != "5")
    return alimentos
}

fun displayCarnes(): ArrayList<Alimento>{
    val alimentos = arrayListOf<Alimento>()
    do {
        val menu = """
                    Selecciona el ingrediente que buscas
                    1. Carne
                    2. Pollo
                    3. Pescado
                    4. Huevo
                    5. Regresar
                """.trimIndent()
        println(menu)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                val response1 = solicitarcantidad("carne")
                val carne = response1?.let { Alimento(it, "Carne", "Carne caiman", 3) }
                if (carne != null) {
                    alimentos.add(carne)
                }
            }
            "2" -> {
                val response1 = solicitarcantidad("Pollo")
                val pollo = response1?.let { Alimento(it, "Pollo", "Pollo americano", 3) }
                if (pollo != null) {
                    alimentos.add(pollo)
                }
            }
            "3" -> {
                val response1 = solicitarcantidad("Pescado")
                val pescado = response1?.let { Alimento(it, "Pescado", "Pescado bocachico", 3) }
                if (pescado != null) {
                    alimentos.add(pescado)
                }
            }
            "4" -> {
                val response1 = solicitarcantidad("Huevo")
                val huevo = response1?.let { Alimento(it, "Huevo", "Huevo costeño", 3) }
                if (huevo != null) {
                    alimentos.add(huevo)
                }
            }
            else -> println("Solo del 1 al 5")
        }
    }while(response2 != "5")
    return alimentos
}

fun displayVerduras(): ArrayList<Alimento>{
    val alimentos = arrayListOf<Alimento>()
    do {
        val menu = """
                    Selecciona el ingrediente que buscas
                    1. Tomate
                    2. Cebolla
                    3. Zanahoria
                    4. Pimenton
                    5. Regresar
                """.trimIndent()
        println(menu)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                val response1 = solicitarcantidad("tomate")
                val tomate = response1?.let { Alimento(it, "tomate", "tomate rojo", 4) }
                if (tomate != null) {
                    alimentos.add(tomate)
                }
            }
            "2" -> {
                val response1 = solicitarcantidad("cebolla")
                val cebolla = response1?.let { Alimento(it, "cebolla", "cebolla blanca", 4) }
                if (cebolla != null) {
                    alimentos.add(cebolla)
                }
            }
            "3" -> {
                val response1 = solicitarcantidad("zanahoria")
                val zanahoria = response1?.let { Alimento(it, "zanahoria", "zanahoria fresca", 4) }
                if (zanahoria != null) {
                    alimentos.add(zanahoria)
                }
            }
            "4" -> {
                val response1 = solicitarcantidad("pimenton")
                val pimenton = response1?.let { Alimento(it, "pimenton", "pimenton verde", 4) }
                if (pimenton != null) {
                    alimentos.add(pimenton)
                }
            }
            else -> println("Solo del 1 al 5")
        }
    }while(response2 != "5")
    return alimentos
}

fun displayFrutas(): ArrayList<Alimento>{
    val alimentos = arrayListOf<Alimento>()
    do {
        val menu = """
                    Selecciona el ingrediente que buscas
                    1. Manzana
                    2. Naranja
                    3. Banano
                    4. Patilla
                    5. Regresar
                """.trimIndent()
        println(menu)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                val response1 = solicitarcantidad("manzana")
                val manzana = response1?.let { Alimento(it, "manzana", "manzana roja", 5) }
                if (manzana != null) {
                    alimentos.add(manzana)
                }
            }
            "2" -> {
                val response1 = solicitarcantidad("naranja")
                val naranja = response1?.let { Alimento(it, "naranja", "naranja dulce", 5) }
                if (naranja != null) {
                    alimentos.add(naranja)
                }
            }
            "3" -> {
                val response1 = solicitarcantidad("banano")
                val banano = response1?.let { Alimento(it, "banano", "banano fresca", 5) }
                if (banano != null) {
                    alimentos.add(banano)
                }
            }
            "4" -> {
                val response1 = solicitarcantidad("patilla")
                val patilla = response1?.let { Alimento(it, "patilla", "patilla verde", 5) }
                if (patilla != null) {
                    alimentos.add(patilla)
                }
            }
            else -> println("Solo del 1 al 5")
        }
    }while(response2 != "5")
    return alimentos
}

fun displayGranos(): ArrayList<Alimento>{
    val alimentos = arrayListOf<Alimento>()
    do {
        val menu = """
                    Selecciona el ingrediente que buscas
                    1. Guandul
                    2. Zaragoza
                    3. Lenteja
                    4. palomito
                    5. Regresar
                """.trimIndent()
        println(menu)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                val response1 = solicitarcantidad("guandul")
                val guandul = response1?.let { Alimento(it, "guandul", "guandul roja", 6) }
                if (guandul != null) {
                    alimentos.add(guandul)
                }
            }
            "2" -> {
                val response1 = solicitarcantidad("zaragoza")
                val zaragoza = response1?.let { Alimento(it, "zaragoza", "zaragoza dulce", 6) }
                if (zaragoza != null) {
                    alimentos.add(zaragoza)
                }
            }
            "3" -> {
                val response1 = solicitarcantidad("lenteja")
                val lenteja = response1?.let { Alimento(it, "lenteja", "lenteja fresca", 6) }
                if (lenteja != null) {
                    alimentos.add(lenteja)
                }
            }
            "4" -> {
                val response1 = solicitarcantidad("palomito")
                val palomito = response1?.let { Alimento(it, "palomito", "palomito verde", 6) }
                if (palomito != null) {
                    alimentos.add(palomito)
                }
            }
            else -> println("Solo del 1 al 5")
        }
    }while(response2 != "5")
    return alimentos
}

fun displayAceites(): ArrayList<Alimento>{
    val alimentos = arrayListOf<Alimento>()
    do {
        val menu = """
                    Selecciona el ingrediente que buscas
                    1. oliva
                    2. girasol
                    3. mantequilla
                    4. Regresar
                """.trimIndent()
        println(menu)
        val response2: String? = readLine()
        when(response2){
            "1" -> {
                val response1 = solicitarcantidad("oliva")
                val oliva = response1?.let { Alimento(it, "oliva", "oliva roja", 7) }
                if (oliva != null) {
                    alimentos.add(oliva)
                }
            }
            "2" -> {
                val response1 = solicitarcantidad("girasol")
                val girasol = response1?.let { Alimento(it, "girasol", "girasol dulce", 7) }
                if (girasol != null) {
                    alimentos.add(girasol)
                }
            }
            "3" -> {
                val response1 = solicitarcantidad("mantequilla")
                val mantequilla = response1?.let { Alimento(it, "mantequilla", "mantequilla fresca", 7) }
                if (mantequilla != null) {
                    alimentos.add(mantequilla)
                }
            }
            else -> println("Solo del 1 al 4")
        }
    }while(response2 != "4")
    return alimentos
}