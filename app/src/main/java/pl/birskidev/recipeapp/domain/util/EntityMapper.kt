package pl.birskidev.recipeapp.domain.util

interface EntityMapper <Entity, DomainModel> {

    fun mapFromEntity(entity: Entity): DomainModel

    fun mapToEntity(domainModel: DomainModel): Entity

    fun fromEntityList(initial: List<Entity>): List<DomainModel>

    fun toEntityList(initial: List<DomainModel>): List<Entity>
}