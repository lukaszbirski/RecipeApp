package pl.birskidev.recipeapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pl.birskidev.recipeapp.network.RecipeService
import pl.birskidev.recipeapp.network.model.RecipeDTOMapper
import pl.birskidev.recipeapp.repository.RecipeRepository
import pl.birskidev.recipeapp.repository.RecipeRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDTOMapper: RecipeDTOMapper
    ): RecipeRepository {
        return RecipeRepositoryImpl(recipeService, recipeDTOMapper)
    }
}