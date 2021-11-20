package pl.birskidev.recipeapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.birskidev.recipeapp.repository.RecipeRepository
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel
@Inject
constructor(
    private val repository: RecipeRepository
) : ViewModel(){
}