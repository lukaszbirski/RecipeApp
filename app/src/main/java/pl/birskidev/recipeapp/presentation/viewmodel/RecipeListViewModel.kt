package pl.birskidev.recipeapp.presentation.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pl.birskidev.recipeapp.BuildConfig
import pl.birskidev.recipeapp.domain.model.Recipe
import pl.birskidev.recipeapp.repository.RecipeRepository
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel
@Inject
constructor(
    private val repository: RecipeRepository
) : ViewModel(){

    val recipes: MutableState<List<Recipe>> = mutableStateOf(listOf())

    init {
        getRepoRecipes()
    }

    private fun getRepoRecipes() {
        viewModelScope.launch {
            recipes.value = repository.search(
                token = BuildConfig.FOOD2FORK_TOKEN,
                page = 1,
                query = "chicken"
            )
        }
    }
}