package com.mealplan.data.entitities.relationships

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mealplan.data.entitities.models.Ingredient
import com.mealplan.data.entitities.models.Meal

data class MealWithIngredients(
    @Embedded val meal: Meal,
    @Relation(
        parentColumn = "mealId",
        entityColumn = "ingredientId",
        associateBy = Junction(MealIngredientsCrossRef::class)
    )
    val ingredients: List<Ingredient>
)
