package com.mealplan.ui
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_meals.*
import com.mealplan.R

class MealsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals)

        bottomNavigationView.setupWithNavController(mealsNavHostFragment.findNavController())
    }
}