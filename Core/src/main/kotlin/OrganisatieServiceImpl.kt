package main.kotlin

import domain.model.OrganisatieInsert
import main.kotlin.domain.repository.OrganisatieRepository

internal class OrganisatieServiceImpl(
    val organisatieRepository: OrganisatieRepository,
) : OrganisatieService {
    override fun verwerk(organisatie: OrganisatieInsert): OrganisatieView = organisatieRepository.save(organisatie)
}
