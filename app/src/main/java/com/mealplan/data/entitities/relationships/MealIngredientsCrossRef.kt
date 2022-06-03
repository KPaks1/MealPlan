package com.mealplan.data.entitities.relationships

import androidx.room.Entity

@Entity(primaryKeys = ["mealId","ingredientId"])
data class MealIngredientsCrossRef(
    val mealId: Int,
    val ingredientId: Int
)
