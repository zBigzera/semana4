
fun main() {
    println("")
    println("Primeiro tópico:")
//1 - Crie uma função que receba dois números inteiros como argumentos e retorne a soma dos mesmos.
    val resultado1at1 = ex1at1(1,3);
    println("O resultado do exercício 1 de Funções Definidas pelo Usuário é de: $resultado1at1")
//2 - Crie uma função que receba um número inteiro como argumento e retorne verdadeiro se o mesmo for par e falso caso contrário.
    val resultado2at1 = ex2at1(7)
    println("O resultado do exercício 2 de Funções Definidas pelo Usuário é: $resultado2at1")
//3 - Crie uma função que receba uma string como argumento e retorne verdadeiro se a mesma for palíndromo (ou seja, lida da esquerda para direita é igual a lida da direita para esquerda) e falso caso contrário.
    val resultado3at1 = ex3at1("pop")
    println("O resultado do exercício 3 de Funções Definidas pelo Usuário é: $resultado3at1")
//4 - Crie uma função que receba um array de números inteiros como argumento e retorne o maior valor presente no array.
    val resultado4at1 = ex4at1(intArrayOf(1, 4, 2, 5, 1, 9, 21, 412, 12, 584, 43 ,561))
    println("O resultado do exercício 4 de Funções Definidas pelo Usuário é: $resultado4at1")
//5 - Crie uma função que receba um array de strings como argumento e retorne uma nova lista contendo apenas as strings que possuem mais de 5 caracteres.
    val resultado5at1 = ex5at1(arrayOf("Abóbora","Requeijão", "Feijão", "Olá","Papo"))
    println("O resultado do exercício 5 de Funções Definidas pelo Usuário é: $resultado5at1")
//    println("Eu.. eu falhei.. $resultado5at1.. :((")

    println("")
    println("Segundo tópico:")
//1 - Crie uma função que receba um número variável de argumentos do tipo Int. e retorne a soma dos mesmos.
    val resultado1at2 = ex1at2(intArrayOf(1,4,5))
    println("O resultado do exercício 1 de Tipos de Argumento de Função é: " + resultado1at2)

//2 - Crie uma função que receba um array de números inteiros e um número inteiro n como argumentos e retorne uma nova lista contendo apenas os elementos do array que são maiores do que n.
    val resultado2at2 = ex2at2(intArrayOf(0,1,7,10,12,43,21), 5)
    println("O resultado do exercício 2 de Tipos de Argumento de Função é: " +resultado2at2)

//3 - Crie uma função que receba uma função de transformação como argumento, um array de números inteiros e retorne uma nova lista contendo os elementos do array transformados pela função de transformação.
    val resultado3at2 = ex3at2(intArrayOf(1,4,6,12,734,41,21,564,1,2,3,1), {it*2} )
    println("O resultado do exercício 3 de Tipos de Argumento de Função é: " +resultado3at2.joinToString()/*sem esse trem vira uns trem aleatório*/)

//4 - Crie uma função que receba um array de strings e um caractere como argumentos e retorne uma nova lista contendo apenas as strings que começam com o caractere informado.
    val resultado4at2 = ex4at2(arrayOf("Abóbora","Requeijão", "Feijão", "Olá","Papo"), 'A')
    println("O resultado do exercício 4 de Tipos de Argumento de Função é: " +resultado4at2)

//5 - Crie uma função que receba um array de números inteiros e um número inteiro n como argumentos e retorne uma nova lista contendo apenas os elementos do array que estão nas posições múltiplas de n.
    val resultado5at2 = ex5at2(intArrayOf(1,4,6,12,734,41,21,564,1,2,3,1, 5, 10, 25, 70), 5)
    println("O resultado do exercício 5 de Tipos de Argumento de Função é: " +resultado5at2)

    println("")
    println("Terceiro tópico:")

//1 - Como criar uma lista em Kotlin com os números de 1 a 10?
    val resultado1at3 = ex1at3()
    val lista = listOf(1..10).flatten()
    val lista2 = List(10){it + 1}
    println("Lista de 1 a 10 exercício de listas: " +resultado1at3 + ", assim: "+lista+"..ou apenas assim: " +lista2)
//2 - Como adicionar um elemento na posição 2 de uma lista já existente em Kotlin?
    println("Exercício 2 da atividade de listas:")
    ex2at3()
//3 -Como remover o último elemento de uma lista em Kotlin?
    val listapadrao = mutableListOf<Any>(0,1,7,10,"Hey",12,43,21, "Olá")
    val resultado3at3 = ex3at3(listapadrao)

    print(" e a com o último valor valor excluido: " + resultado3at3)
    println("")
    println("")
//at4
//1 -  Como criar um Map em Kotlin com as cores e seus respectivos códigos RGB?
    ex1at4();
    val coresRGB = mapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF"
    )
//2 - Como verificar se um determinado elemento existe em um Map em Kotlin?
   println("Esta cor "+ex2at4("verde")+" no mapeamento")


//3 -  Como remover um elemento específico de um Map em Kotlin?
    val mapa = mutableMapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF"
    )
    println("Mapa antes da remoção: $mapa" )
    ex3at4("azul", mapa)
    println("Mapa após a remoção: $mapa")

//at5
//1 - Como criar um Set em Kotlin com os números de 1 a 5?
    println(ex1at5());
    val set = setOf(1, 2, 3, 4, 5)
    println("ou: " + set)
//2 - Como verificar se um determinado elemento existe em um Set em Kotlin?
    val set2 = setOf("maça", "banana", "laranja", "pera")
    if (set2.contains("banana")) {
        println("O elemento banana está presente no Set")
    } else {
        println("O elemento banana não está presente no Set")
    }

//3 - Como remover um elemento específico de um Set em Kotlin?
    val set3: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    println("Set original: $set3")
    ex3at5(4, set3)
    println("Set após a remoção do número 4: $set3")
}

fun ex1at1(x: Int, y: Int) = x + y

fun ex2at1(x: Int):Boolean{return x%2==0}

fun ex3at1(x: String): Boolean{return x==x.reversed()}

fun ex4at1(x: IntArray): Int { val y = x.max(); return y }

fun ex5at1(x: kotlin.Array<String>): List<String>{ //EU QUERIA MUITO ENTENDER PQ SO FUNCIONOU QD ADICIONEI KOTLIN.ARRAY
    return x.filter { it.length > 5 }
}


//at2

fun ex1at2(num: IntArray): Int{
    var soma = 0
    for( x in num){ soma += x}; return soma
}

fun ex2at2(array: IntArray, x: Int): List<Int>{
    return array.filter {it > x}
}

fun ex3at2(array: IntArray, transform1: (Int) -> Int): IntArray {
    fun transform2(x: Int): Int = transform1(x)
    for (i in array.indices) {
        array[i] = transform2(array[i])
    }

    return array
}


fun ex4at2(array: kotlin.Array<String>, x: Char): List<String>{
    return array.filter{it.startsWith(x)}

}

fun ex5at2(array: IntArray, x: Int): List<Int>{
    val resultado = mutableListOf<Int>()
    for (i in array.indices){
        if((i+1)%x==0){
            resultado.add(array[i])
        }
    }
    return resultado
}

//at3
fun ex1at3(): List<Int>{
    return (1..10).toList()
}
fun ex2at3() {
    val lista = mutableListOf<Int>(1, 2, 4, 5, 6, 7, 8, 9, 10)
    lista.add(2, 3)
    val listaModificada = lista.toList()
    println("Lista atual: $lista, lista modificada: $listaModificada")
}

fun ex3at3(list: MutableList<Any>): MutableList<Any> {
    println("Sobre exercício 3 da atividade de listas: Antes de ser modificada era: " + list)
    list.removeLastOrNull()
    return list
}

//at4
fun ex1at4(): Map<String, String> {
    val cores = mapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF"
    )
    return cores
}
fun ex2at4(cor: String): String {
    val cores = mapOf("vermelho" to "#FF0000", "verde" to "#00FF00", "azul" to "#0000FF")
    if (cores.containsKey(cor)) {
        return "existe"
    } else {
        return "não existe"
    }
}

fun ex3at4(chave: String, mapa: MutableMap<String, String>): String? {
    return mapa.remove(chave)
}
fun ex1at5(): Set<Int> {
    return setOf(1, 2, 3, 4, 5)
}
fun ex3at5(x: Int, set: MutableSet<Int>) {
    if (set.contains(x)) {
        set.remove(x)
    }
}