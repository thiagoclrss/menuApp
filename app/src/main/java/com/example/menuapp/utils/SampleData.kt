package com.example.menuapp.utils

import com.example.menuapp.model.Product
import com.example.menuapp.model.ProductSection

object SampleData {

    private val productList = listOf(
        Product("Batata Frita","10 minutos","R$ 10,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Macaxeira Frita","8 minutos","R$ 12,00"),
        Product("Pão de Alho","7 minutos","R$ 11,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
        Product("Bolinha de Queijo","10 minutos","R$ 17,00"),
    )

    val sectionList = listOf(
        ProductSection("Entradas", productList),
        ProductSection("Bebidas", productList),
        ProductSection("Pratos Principais", productList),
        ProductSection("Sobremesa", productList),
    )
}