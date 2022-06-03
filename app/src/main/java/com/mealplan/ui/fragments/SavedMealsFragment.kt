package com.mealplan.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mealplan.R
import com.mealplan.adapters.MealAdapter
import com.mealplan.ui.MealViewModel
import com.mealplan.ui.MealsActivity


class SavedMealsFragment : Fragment(R.layout.fragment_saved_meals){

    lateinit var viewModel : MealViewModel
    lateinit var mealsAdapter : MealAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as MealsActivity).viewModel
//        mealsAdapter.setOnItemClickListener {
//            val bundle = Bundle().apply {
//                putSerializable("meal", it)
//            }
//            findNavController().navigate(
//                R.id.action_savedMealsFragment_to_mealFragment,
//                bundle
//            )
//        }
    }
}