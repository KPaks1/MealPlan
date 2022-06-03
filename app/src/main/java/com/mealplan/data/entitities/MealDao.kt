package com.mealplan.data.entitities

import androidx.lifecycle.LiveData
import androidx.room.*
import com.mealplan.data.entitities.relationships.MealIngredientsCrossRef
import com.mealplan.data.entitities.relationships.MealSavedMealCrossRef
import com.mealplan.data.entitities.models.Ingredient
import com.mealplan.data.entitities.models.Meal
import com.mealplan.data.entitities.models.SavedMeal

@Dao
interface MealDao {
//  Inserts
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(meal: Meal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIngredient(ingredient: Ingredient)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSavedMeal(savedMeal: Meal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMealIngredientsCrossRef(crossRef: MealIngredientsCrossRef)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMealSavedMealCrossRef(crossRef: MealSavedMealCrossRef)

//  Gets
    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM meals WHERE mealName = :mealName")
    fun getMeal(mealName: String): Meal

    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM meals")
    fun getAllMeals(): LiveData<List<Meal>>

    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM ingredients WHERE ingredientName = :ingredientName")
    fun getIngredient(ingredientName: String): LiveData<Ingredient>

    //@Transaction //Ensures no multithreading issues
    //@Query("SELECT * FROM meal WHERE mealName = :mealName")
    //fun getIngredientsOfMeal(mealName: String): LiveData<List<Ingredient>>

    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM meals CROSS JOIN saved_meals WHERE meals.mealId = saved_meals.mealId")
    fun getSavedMeals(): LiveData<List<SavedMeal>>

// Deletes
    // delete meal

    @Delete
    fun deleteMeal(meal: Meal)

    // delete ingredient
    // delete ingredient from meal
    // delete saved meal
}