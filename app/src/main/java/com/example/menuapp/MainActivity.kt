package com.example.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menuapp.adapter.ProductSectionAdapter
import com.example.menuapp.databinding.ActivityMainBinding
import com.example.menuapp.model.Product
import com.example.menuapp.model.ProductSection
import com.example.menuapp.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var productArraylist: ArrayList<Product>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter = ProductSectionAdapter(SampleData.sectionList)
        }


        val starter = arrayOf(
            "Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho","Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho",
            "Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho","Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho"
        )

        val mainCourse = arrayOf(
            "Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho"
        )

        val drinks = arrayOf(
            "Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho"
        )

        val dessert = arrayOf(
            "Batata Frita", "Bolinha de Queijo", "Macaxeira Frita", "Pão de Alho"
        )

        val time = arrayOf(
            "(10 minutos)", "(8 minutos)", "(5 minutos)", "(4 minutos)","(10 minutos)", "(8 minutos)", "(5 minutos)", "(4 minutos)",
            "(10 minutos)", "(8 minutos)", "(5 minutos)", "(4 minutos)","(10 minutos)", "(8 minutos)", "(5 minutos)", "(4 minutos)"
        )

        val price = arrayOf(
            "R$ 10,00", "R$ 20,00", "R$ 30,00", "R$ 40,00","R$ 10,00", "R$ 20,00", "R$ 30,00", "R$ 40,00",
            "R$ 10,00", "R$ 20,00", "R$ 30,00", "R$ 40,00","R$ 10,00", "R$ 20,00", "R$ 30,00", "R$ 40,00"
        )



    }
}