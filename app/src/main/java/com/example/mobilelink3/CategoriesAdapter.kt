package com.example.mobilelink3

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mobilelink3.databinding.LayoutRvCategoriesBinding

class CategoriesAdapter() :
    ListAdapter<Category, CategoriesAdapter.ViewHolder>(Category.CategoryDiffCallBack()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = LayoutRvCategoriesBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fillView(getItem(position))
    }

    class ViewHolder(private val binding: LayoutRvCategoriesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun fillView(category: Category) {
            binding.tvCategory.text = category.category
            category.image?.let {
                Glide.with(binding.root.context)
                    .load(category.image)
                    .into(binding.imgCategory)

            }
        }
    }
}