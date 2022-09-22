package com.example.sbado17

import java.util.*

/*
2.-  Escribe un programa que simule el inicio de sesión de un usuario.
Mientras el nombre de usuario y la contraseña sean válidos, mostrar un
mensaje de bienvenida con su nombre.
En caso contrario mostrar un mensaje que uno de los datos no coincide.
 */

fun main(){
    var User = "Jovany"
    var Pass = "1234"

    println("Ingrese el nombre de usuario")
    var usuario = readLine()
    println("Ingrese la contraseña")
    var contra = readLine()

    if (usuario == User && contra == Pass){
        println("Inicio de sesión exitoso")
    }else{
        println("Error, uno de los datos no coincide\nAsegúrate de diferenciar mayúsculas y minúsculas")
    }
}