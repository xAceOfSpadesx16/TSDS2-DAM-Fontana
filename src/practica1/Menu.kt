package practica1

class Menu {
    fun iniciar(){
        var opcion: String? = "3"
        do{
            println("Que actividad desea realizar?: ")
            println("1- Calcular edad del usuario.")
            println("2- Menu de dias.")
            print("Elija una opcion: ")
            opcion = readln()

            if (opcion == "1"){
                this.opcionUsuario()
            }
            if (opcion == "2"){
                this.opcionMenuDias()
            }

        }while(opcion != "3")

    }

    private fun opcionUsuario(){
        print("Ingrese el nombre de usuario: ")
        val username: String = readln()
        var edad: Int? = null

        do {
            print("Ingrese la edad: ")
            val inputEdad = readlnOrNull()?.trim()

            if (inputEdad.isNullOrEmpty() || !inputEdad.matches(Regex("-?\\d+"))) {
                println("Ingresa un numero entero válido sin letras ni símbolos. Intente nuevamente.")
            } else {
                edad = inputEdad.toInt()
            }
        } while (edad == null)
        println()
        val usuario: Usuario = Usuario(username, edad)
        usuario.evaluarEdad()
    }

    fun opcionMenuDias(){
        val menuDias: MenuDias = MenuDias()
        menuDias.iniciar()
    }
}