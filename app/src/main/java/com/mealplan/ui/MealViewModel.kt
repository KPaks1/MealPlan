package com.mealplan.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mealplan.repository.MealsRepository

class MealViewModel(
    val mealsRepository : MealsRepository
    ) : ViewModel() {
}