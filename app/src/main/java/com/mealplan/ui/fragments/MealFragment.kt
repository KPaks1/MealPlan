package com.mealplan.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mealplan.R
import com.mealplan.adapters.MealAdapter
import com.mealplan.ui.MealViewModel
import com.mealplan.ui.MealsActivity


class MealFragment : Fragment(R.layout.fragment_meal){

    lateinit var viewModel : MealViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel = (activity as MealsActivity).viewModel
    }
}