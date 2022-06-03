package com.mealplan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mealplan.R
import com.mealplan.data.entitities.models.Ingredient
import kotlinx.android.synthetic.main.item_meal_preview.view.*


class IngredientAdapter : RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder>() {

    inner class IngredientViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<Ingredient>(){
        override fun areItemsTheSame(oldItem: Ingredient, newItem: Ingredient): Boolean {
            return oldItem.ingredientId == newItem.ingredientId
        }

        override fun areContentsTheSame(oldItem: Ingredient, newItem: Ingredient): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        return IngredientViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_ingredient_preview,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        val ingredient = differ.currentList[position]
        holder.itemView.apply{
            //Glide.with(this).load(meal.mealImage).into(ivMealImage)
            tvTitle.text = ingredient.ingredientName
            tvDescription.text = ingredient.ingredientDescription
            setOnClickListener{
                onItemClickListener?.let { it(ingredient) }
            }
        }
    }

    private var onItemClickListener: ((Ingredient) -> Unit)? = null

    fun setOnItemClickListener(listener: (Ingredient) -> Unit) {
        onItemClickListener = listener
    }
    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}