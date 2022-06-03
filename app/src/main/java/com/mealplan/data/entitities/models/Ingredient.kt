package com.mealplan.data.entitities.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "ingredients"
)
data class Ingredient(
    @PrimaryKey(autoGenerate = false)
    val ingredientId: Int? = null,
    val ingredientName: String,
    val ingredientDescription: String?
//    val ingredientImage: String?
)
