package com.mealplan.data.entitities.models

import androidx.room.*

@Entity
data class Meal(
    @PrimaryKey(autoGenerate = false)
    val mealId: Int? = null,
    val mealName: String,
    val mealDescription: String?,
    //val mealImage: ImageView,
)
