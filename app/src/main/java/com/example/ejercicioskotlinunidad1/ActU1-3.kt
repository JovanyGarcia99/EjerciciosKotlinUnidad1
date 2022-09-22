package com.example.sbado17

import java.util.*

/*
3.- Haz un programa que dada una temperatura en grados centígrados,
imprima en pantalla qué tipo de ropa podrías usar.
Utiliza la siguiente información para devolver los mensajes que correspondan:
Si la temperatura es  devolver: "Usa un Abrigo hace frío"
Si la temperatura está devolver: "Te irá bien si usas una Chaqueta, el clima es templado"
Si la temperatura es  devolver: "Es mejor que lleves algo ligero, hace calor"
 */

fun main (){
    var scanner = Scanner(System.`in`)
    println("Ingresa la temperatura en centígrados")
    var temp = scanner.nextInt()

    if (temp <= 20){
        println("Usa un Abrigo hace frío")
    }else{if (temp in 21..29){
        println("Te irá bien si usas una Chaqueta, el clima es templado")
    }else{
        println("Es mejor que lleves algo ligero, hace calor")
    }}
}