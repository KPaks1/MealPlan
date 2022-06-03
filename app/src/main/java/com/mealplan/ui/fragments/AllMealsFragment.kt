package com.mealplan.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mealplan.R
import com.mealplan.adapters.MealAdapter
import com.mealplan.ui.MealViewModel
import com.mealplan.ui.MealsActivity
import kotlinx.android.synthetic.main.fragment_all_meals.*


class AllMealsFragment : Fragment(R.layout.fragment_all_meals){

    lateinit var viewModel : MealViewModel
    lateinit var mealsAdapter: MealAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel = (activity as MealsActivity).viewModel
        setupRecyclerView()

    }

    private fun setupRecyclerView(){
        mealsAdapter = MealAdapter()
        rvAllMeals.apply{
            adapter = mealsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

}