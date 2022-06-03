package com.mealplan.data.entitities.models

import android.media.Image
import android.widget.ImageView
import androidx.room.*
import java.io.Serializable

@Entity(
    tableName = "meals"
)
data class Meal(
    @PrimaryKey(autoGenerate = false)
    val mealId: Int? = null,
    val mealName: String,
    val mealDescription: String?,
    val mealUrl: String = "https://www.google.com/",
//    val mealImage: ImageView? = null
) : Serializable


