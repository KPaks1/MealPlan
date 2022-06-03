package com.mealplan.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mealplan.repository.MealsRepository

class MealsViewModelProviderFactory(
    val mealsRepository: MealsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MealViewModel(mealsRepository) as T
    }
}