package com.example.mobilelink3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilelink3.databinding.ActivityMainBinding
import com.example.mobilelink3.databinding.LayoutRvCategoriesBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var categoriesAdapter: CategoriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        categoriesAdapter = CategoriesAdapter()
        binding.rvCategories.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = categoriesAdapter
        }

        categoriesAdapter.submitList(getDummyCategories())

    }

    private fun getDummyCategories(): MutableList<Category> {
        val categories = mutableListOf<Category>()
        categories.add(Category("First category","https://imgv3.fotor.com/images/cover-photo-image/a-beautiful-girl-with-gray-hair-and-lucxy-neckless-generated-by-Fotor-AI.jpg"))
        categories.add(Category("Second category","https://imgv3.fotor.com/images/cover-photo-image/a-beautiful-girl-with-gray-hair-and-lucxy-neckless-generated-by-Fotor-AI.jpg"))
        categories.add(Category("Third category"))
        categories.add(Category("Fourth category"))
        return categories
    }
}