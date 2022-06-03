package com.mealplan.data.entitities

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mealplan.data.entitities.relationships.MealIngredientsCrossRef
import com.mealplan.data.entitities.relationships.MealSavedMealCrossRef
import com.mealplan.data.entitities.models.Ingredient
import com.mealplan.data.entitities.models.Meal
import com.mealplan.data.entitities.models.SavedMeal

@Database(
    entities = [
        Meal::class,
        Ingredient::class,
        SavedMeal::class,
        MealIngredientsCrossRef::class,
        MealSavedMealCrossRef::class
    ],
    version = 1
)
abstract class MealsDatabase : RoomDatabase(){

    abstract val dao : MealDao

    companion object{
        @Volatile
        private var INSTANCE : MealsDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK){
            INSTANCE ?: createDatabase(context).also {INSTANCE = it}
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
            context.applicationContext,
            MealsDatabase::class.java,
            "mealplanDB"
            ).build()
    }
}
