package com.mealplan.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.mealplan.R
import com.mealplan.adapters.MealAdapter
import com.mealplan.ui.MealViewModel
import com.mealplan.ui.MealsActivity
import kotlinx.android.synthetic.main.fragment_all_meals.*
import kotlinx.android.synthetic.main.fragment_saved_meals.*


class AllMealsFragment : Fragment(R.layout.fragment_all_meals){

    lateinit var viewModel : MealViewModel
    lateinit var mealsAdapter: MealAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as MealsActivity).viewModel

        setupRecyclerView()
        mealsAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("meal", it)
            }
            findNavController().navigate(
                R.id.action_allMealsFragment_to_mealFragment,
                bundle
            )
        }

//    val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(
//        ItemTouchHelper.UP or ItemTouchHelper.DOWN,
//        ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
//    ){
//        override fun onMove(
//            recyclerView: RecyclerView,
//            viewHolder: RecyclerView.ViewHolder,
//            target: RecyclerView.ViewHolder
//        ): Boolean {
//            return true
//        }
//
//        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
//            val position = viewHolder.adapterPosition
//            val meal = mealsAdapter.differ.currentList[position]
//            viewModel.deleteMeal(meal)
//            Snackbar.make(view, "Successfully deleted meal", Snackbar.LENGTH_LONG).apply {
//                setAction("Undo") {
//                    viewModel.saveMeal(meal)
//                }
//            }.show()
//        }
//    }
//        ItemTouchHelper(itemTouchHelperCallback).apply {
//            attachToRecyclerView(rvSavedMeals)
//        }
//    viewModel.getAllMeals().observe(viewLifecycleOwner, Observer {  meals ->
//        mealsAdapter.differ.submitList(meals)
//    })
    }
//
    private fun setupRecyclerView(){
        mealsAdapter = MealAdapter()
        rvAllMeals.apply{
            adapter = mealsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

}