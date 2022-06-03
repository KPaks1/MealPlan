package com.mealplan.data.entitities.relationships

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

import com.mealplan.data.entitities.models.Meal

data class MealWithSavedMeal(
    @Embedded val meal: Meal,
    @Relation(
        parentColumn = "mealId",
        entityColumn = "savedMealId",
        associateBy = Junction(MealSavedMealCrossRef::class)
    )
    val savedMeals: List<Meal>
)