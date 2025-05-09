package practicaobject

fun main(){
    val libro = object {
        val paginas: MutableMap<Int, String> = mutableMapOf(
            1 to "Contenido de Pagina 1",
            2 to "Contenido de Pagina 2",
            3 to "Contenido de Pagina 3",
        )

        fun leerFormatoEBook(){
            println("Su libro en formato Ebook.")
            println()
            this.paginas.forEach {(numPagina, contenido) ->
                println("Pagina N° $numPagina")
                println(contenido)
                println()
            }
        }
    }

    libro.paginas.put(4, "Contenido de Pagina 4")

    libro.paginas += 5 to "Contenido de Pagina 5"

    libro.paginas[1] = "Contenido de Pagina 1 modificado"

    libro.leerFormatoEBook()
}