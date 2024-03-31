package com.example.menuapp.utils

import com.example.menuapp.model.Product
import com.example.menuapp.model.ProductSection

object SampleData {

    private val starterList = listOf(
        Product("Batata Frita","(10 minutos)","R$ 10,00"),
        Product("Bolinha de Queijo","(10 minutos)","R$ 17,00"),
        Product("Macaxeira Frita","(8 minutos)","R$ 12,00"),
        Product("Pão de Alho","(7 minutos)","R$ 11,00"),
    )

    private val mainCourseList = listOf(
        Product("Baião de Dois","(23 minutos)","R$ 22,00"),
        Product("Macarronada","(33 minutos)","R$ 35,00"),
        Product("Picanha","(37 minutos)","R$ 80,00"),
        Product("Frango Assado","(21 minutos)","R$ 25,00"),
        Product("Feijoada","(38 minutos)","R$ 37,00"),
        Product("Bobó de camarão","(29 minutos)","R$ 40,00"),
        Product("Tacacá","(25 minutos)","R$ 47,00"),
        Product("Galinhada","(22 minutos)","R$ 27,70"),
        Product("Picadinho de carne","(23 minutos)","R$ 29,90"),
        Product("Arroz carreteiro","(17 minutos)","R$ 28,30"),
        Product("Carne de Sol","(25 minutos)","R$ 30,00"),
        Product("Moqueca de Arraia","(39 minutos)","R$ 65,00"),
        Product("Pato no Tucupi","(33 minutos)","R$ 30,10"),
        Product("Panelada","(22 minutos)","R$ 38,50")

    )

    private val drinksList = listOf(
        Product("Capirinha","(14 minutos)","R$ 20,00"),
        Product("Piña Colada","(11 minutos)","R$ 17,00"),
        Product("Suco de Limão","(7 minutos)","R$ 12,00"),
        Product("Suco de laranja","(7 minutos)","R$ 12,00"),
        Product("Suco de Morango","(7 minutos)","R$ 12,00"),
    )

    private val dessertList = listOf(
        Product("Sorvete de Cajá","(2 minutos)","R$ 15,00"),
        Product("Mousse de Limão","(9 minutos)","R$ 18,00"),
        Product("Pudim","(8 minutos)","R$ 17,60"),
        Product("Picolé","(2 minutos)","R$ 11,20"),
        Product("Brigadeiro","(10 minutos)","R$ 12,00"),
        Product("Mousse de Maracujá","(9 minutos)","R$ 18,00"),
        Product("Torta","(6 minutos)","R$ 21,60"),
        Product("Bolo","(8 minutos)","R$ 22,20"),
    )

    val sectionList = listOf(
        ProductSection("Entradas", starterList),
        ProductSection("Pratos Principais", mainCourseList),
        ProductSection("Bebidas", drinksList),
        ProductSection("Sobremesa", dessertList),
    )
}