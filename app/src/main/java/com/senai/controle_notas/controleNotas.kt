package com.senai.controle_notas

fun situacaoAluno(media: Int): String {
    if (media >= 5) {
        return "Aprovado"
    } else {
        return "Reprovado"
    }
}

// Padrão de funções
//    private fun calcularMedia(nota1: Int, nota2: Int): Int {
//        return (nota1 + nota2) / 2
//    }

//Forma reduzida - apenas quando tem uma única linha
//fun calcularMedia(nota1: Int, nota2: Int): Int = (nota1 + nota2) / 2

//Usando aero function
//val calcularMedia = {nota1: Int, nota2: Int -> (nota1 + nota2) / 2}

fun calcularMedia(vararg notas: Int): Int {
    var soma = 0
    for (nota in notas) {
        soma += nota
    }
    val media = soma / notas.size
    return media
}