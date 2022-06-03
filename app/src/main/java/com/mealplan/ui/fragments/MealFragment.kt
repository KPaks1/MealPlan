package com.mealplan.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.mealplan.R
import com.mealplan.ui.MealViewModel
import com.mealplan.ui.MealsActivity
import kotlinx.android.synthetic.main.fragment_meal.*


class MealFragment : Fragment(R.layout.fragment_meal){

    lateinit var viewModel : MealViewModel
    val args: MealFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as MealsActivity).viewModel
//        val newMeal = args.meal
//        webView.apply {
//            webViewClient = WebViewClient()
//            loadUrl(newMeal.mealUrl)
//        }


    }
}

