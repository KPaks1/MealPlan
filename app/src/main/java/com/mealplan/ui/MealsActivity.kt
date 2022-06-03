package com.mealplan.ui
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_meals.*
import com.mealplan.R
import com.mealplan.data.entitities.models.Ingredient
import com.mealplan.data.entitities.MealsDatabase
import com.mealplan.data.entitities.models.Meal
import com.mealplan.repository.MealsRepository
import kotlinx.coroutines.launch

class MealsActivity : AppCompatActivity() {

    lateinit var viewModel: MealViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals)

        val mealsRepository = MealsRepository(MealsDatabase(this))
//
        val viewModelProviderFactory = MealsViewModelProviderFactory(mealsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[MealViewModel::class.java]
//
//        val meals = listOf(
//            Meal(1,"Mashed Potatoes", "Whole lotta mashed ass potatoes", "https://www.google.com"),
//            Meal(2,"Healthy Salad", "Whole lotta mean greens", "https://www.google.com")
//        )
//        lifecycleScope.launch{
//            meals.forEach{ mealsRepository.insert(it)}
//        }
        //populateDatabase(mealsRepository)

        bottomNavigationView.setupWithNavController(mealsNavHostFragment.findNavController())
    }

    //private fun populateDatabase(mealsRepository: MealsRepository){


//        val ingredients = listOf(
//            Ingredient(1,"Brown Potato", "Whole lotta brown ass potato"),
//            Ingredient(2,"Ice Burg lettuce", "Whole lotta green leaf"),
//            Ingredient(3,"Tomato", "Fruit, not a vege")
//        )



    //}
}
