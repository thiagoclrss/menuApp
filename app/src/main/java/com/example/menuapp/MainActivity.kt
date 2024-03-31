package com.example.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    }



}