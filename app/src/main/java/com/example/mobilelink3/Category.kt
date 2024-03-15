package com.example.mobilelink3

import androidx.recyclerview.widget.DiffUtil

data class Category(val category:String,val image:String?=null){

     class CategoryDiffCallBack : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean =
            oldItem == newItem
    }
}
