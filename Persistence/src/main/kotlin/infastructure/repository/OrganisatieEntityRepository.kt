package org.example.infastructure.repository

import domain.model.OrganisatieInsert
import infastructure.OrganisatieEntity
import main.kotlin.OrganisatieView
import main.kotlin.domain.repository.OrganisatieRepository
import org.example.OrganisatieId
import org.example.infastructure.factory.toEntity
import org.example.infastructure.factory.toOrganisatieAangemaaktEvent
import org.example.infastructure.factory.toView
import org.example.infastructure.service.EventService
import java.util.*

internal class OrganisatieEntityRepository(
    private val eventService: EventService,
) : OrganisatieRepository {
    override fun save(organisatie: OrganisatieInsert): OrganisatieView =
        organisatie
            .toEntity()
            .let(OrganisatieJpaRepository::save)
            .toView()
            .also(::verstuurEvent)

    private fun verstuurEvent(organisatie: OrganisatieView) {
        eventService.publishEvent(organisatie.toOrganisatieAangemaaktEvent())
    }

    override fun findById(id: UUID): OrganisatieView? = OrganisatieJpaRepository.findById(id)?.let(OrganisatieEntity::toView)

    override fun getById(id: OrganisatieId): OrganisatieView =
        OrganisatieJpaRepository
            .findById(id.value)
            ?.toView()
            ?: throw IllegalArgumentException("Organisatie met id ${id.value} bestaat niet")

    override fun existsById(id: UUID): OrganisatieId? = OrganisatieId(id).takeIf { OrganisatieJpaRepository.existsById(id) }
}
