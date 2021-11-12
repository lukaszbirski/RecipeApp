package pl.birskidev.recipeapp.network.response

import com.google.gson.annotations.SerializedName
import pl.birskidev.recipeapp.network.model.RecipeDTO

data class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDTO>
)