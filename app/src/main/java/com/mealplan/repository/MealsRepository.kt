package com.mealplan.repository

import androidx.lifecycle.LiveData
import com.mealplan.data.entitities.MealsDatabase
import com.mealplan.data.entitities.models.Meal

class MealsRepository(
    val db : MealsDatabase
) {
    fun getAllMeals(): LiveData<List<Meal>> = db.dao.getAllMeals()

    suspend fun insert(meal: Meal) = db.dao.insert(meal)

    suspend fun saveMeal(meal: Meal) = db.dao.insertSavedMeal(meal)

    suspend fun getMeal(meal: Meal): Meal = db.dao.getMeal(meal.mealName)

    suspend fun deleteMeal(meal: Meal) = db.dao.deleteMeal(meal)

}