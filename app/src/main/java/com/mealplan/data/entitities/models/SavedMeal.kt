package com.mealplan.data.entitities.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "saved_meals"
)
data class SavedMeal (
    @PrimaryKey(autoGenerate = false)
    val savedMealID: Int,
    val mealId: Int
)