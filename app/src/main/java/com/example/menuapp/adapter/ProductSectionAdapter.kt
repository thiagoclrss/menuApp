package com.example.menuapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuapp.R
import com.example.menuapp.databinding.ParentItemBinding
import com.example.menuapp.model.ProductSection

class ProductSectionAdapter (private val sectionList : List<ProductSection>) :
    RecyclerView.Adapter<ProductSectionAdapter.CollectionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val section = sectionList[position]
            sectionName.text =  section.title //titulo da seção dos produtos
            val productAdapter = ProductAdapter(section.products)
            rvSection.adapter = productAdapter //lista de produtos para a recyclerview
        }
    }

    override fun getItemCount() = sectionList.size

    inner class CollectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = ParentItemBinding.bind(itemView)
    }
}