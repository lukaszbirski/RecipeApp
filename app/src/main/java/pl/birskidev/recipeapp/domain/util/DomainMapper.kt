package pl.birskidev.recipeapp.domain.util

interface DomainMapper <T, DomainModel> {

    fun mapToDomainModel(model: T): DomainModel

    fun mapFromDomainModel(domainModel: DomainModel): T

    fun mapToDomainModelList(initial: List<T>): List<DomainModel>

    fun mapFromDomainModelList(initial: List<DomainModel>): List<T>
}