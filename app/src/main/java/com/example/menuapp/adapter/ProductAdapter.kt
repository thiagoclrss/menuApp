package com.example.menuapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.menuapp.R
import com.example.menuapp.databinding.ItemBinding
import com.example.menuapp.model.Product

class ProductAdapter (private val productList : List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
    val indexList = mutableListOf<Int>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount() = productList.size

    override fun onBindViewHolder(holder : ProductViewHolder, position : Int){
        val product = productList[position]

        holder.binding.apply {
            nameProduct.text = productList[position].name
            timeProduct.text = productList[position].time
            priceProduct.text = productList[position].price

            nameProduct.setOnCheckedChangeListener { _, isChecked ->
                if(product.isChecked != isChecked){
                    product.isChecked = isChecked
                    //Toast.makeText(this,"",Toast.LENGTH_SHORT).show()
                    indexList.add(productList.indexOf(product))
                    notifyItemChanged(productList.indexOf(product))
                }
            }
        }
    }

    inner class ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
       val binding = ItemBinding.bind(itemView)
    }

}