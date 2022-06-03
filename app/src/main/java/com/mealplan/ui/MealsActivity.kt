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
import com.mealplan.repository.MealsRepository
import kotlinx.coroutines.launch

class MealsActivity : AppCompatActivity() {

    lateinit var viewModel: MealViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals)

        bottomNavigationView.setupWithNavController(mealsNavHostFragment.findNavController())

        val mealsRepository = MealsRepository(MealsDatabase(this))
//        val viewModelProviderFactory = MealsViewModelProviderFactory(mealsRepository)
//        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(MealViewModel::class.java)
    }
}
