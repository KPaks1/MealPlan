package com.mealplan.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mealplan.data.entitities.models.Meal
import com.mealplan.repository.MealsRepository
import kotlinx.coroutines.launch

class MealViewModel(val mealsRepository : MealsRepository) : ViewModel() {

    private val allMeals: LiveData<List<Meal>> = getMeals()


    fun getMeals() = mealsRepository.getAllMeals()

    fun getMeal(meal: Meal) = viewModelScope.launch {
        mealsRepository.getMeal(meal)
    }

    fun saveMeal(meal: Meal) = viewModelScope.launch{
        mealsRepository.saveMeal(meal)
    }

    fun deleteMeal(meal: Meal) = viewModelScope.launch {
        mealsRepository.deleteMeal(meal)
    }


}
