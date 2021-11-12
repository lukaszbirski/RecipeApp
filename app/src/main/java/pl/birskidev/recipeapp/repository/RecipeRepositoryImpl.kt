package pl.birskidev.recipeapp.repository

import pl.birskidev.recipeapp.domain.model.Recipe
import pl.birskidev.recipeapp.network.RecipeService
import pl.birskidev.recipeapp.network.model.RecipeDTOMapper

class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDTOMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.mapToDomainModelList(recipeService.search(token = token, page = page, query = query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token = token, id = id))
    }
}