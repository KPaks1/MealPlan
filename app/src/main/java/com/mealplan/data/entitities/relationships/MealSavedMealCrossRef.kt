package com.mealplan.data.entitities.relationships

import androidx.room.Entity

@Entity(primaryKeys = ["mealId","savedMealId"])
data class MealSavedMealCrossRef(
    val mealId: Int,
    val savedMealId: Int
)
