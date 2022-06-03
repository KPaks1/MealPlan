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
    suspend fun insertMeal(meal: Meal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIngredient(ingredient: Ingredient)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSavedMeal(savedMeal: SavedMeal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMealIngredientsCrossRef(crossRef: MealIngredientsCrossRef)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMealSavedMealCrossRef(crossRef: MealSavedMealCrossRef)

//  Gets
    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM meal WHERE mealName = :mealName")
    fun getMeal(mealName: String): LiveData<Meal>

    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM ingredient WHERE ingredientName = :ingredientName")
    fun getIngredient(ingredientName: String): LiveData<Ingredient>

    //@Transaction //Ensures no multithreading issues
    //@Query("SELECT * FROM meal WHERE mealName = :mealName")
    //fun getIngredientsOfMeal(mealName: String): LiveData<List<Ingredient>>

    @Transaction //Ensures no multithreading issues
    @Query("SELECT * FROM meal CROSS JOIN SavedMeal WHERE Meal.mealId = SavedMeal.mealId")
    fun getSavedMeals(): LiveData<List<SavedMeal>>

// Deletes
    // delete meal

    @Delete
    fun deleteMeal(meal: Meal)

    // delete ingredient
    // delete ingredient from meal
    // delete saved meal
}