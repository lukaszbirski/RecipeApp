package pl.birskidev.recipeapp.network.model

import pl.birskidev.recipeapp.domain.model.Recipe
import pl.birskidev.recipeapp.domain.util.DomainMapper

class RecipeDTOMapper : DomainMapper<RecipeDTO, Recipe> {

    override fun mapToDomainModel(model: RecipeDTO): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            featuredImage = model.featuredImage,
            rating = model.rating,
            publisher = model.publisher,
            sourceUrl = model.sourceUrl,
            description = model.description,
            cookingInstructions = model.cookingInstructions,
            ingredients = model.ingredients?: listOf(),
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated
        )
    }

    override fun mapFromDomainModel(domainModel: Recipe): RecipeDTO {
        return RecipeDTO(
            pk = domainModel.id,
            title = domainModel.title,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            sourceUrl = domainModel.sourceUrl,
            description = domainModel.description,
            cookingInstructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated
        )
    }

    override fun mapToDomainModelList(initial: List<RecipeDTO>): List<Recipe> {
        return initial.map { mapToDomainModel(it) }
    }

    override fun mapFromDomainModelList(initial: List<Recipe>): List<RecipeDTO> {
        return initial.map { mapFromDomainModel(it) }
    }
}