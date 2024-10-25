package main.kotlin.domain.repository

import domain.model.OrganisatieInsert
import main.kotlin.OrganisatieView
import org.example.OrganisatieId
import java.util.*

interface OrganisatieRepository {
    fun save(organisatie: OrganisatieInsert): OrganisatieView

    fun findById(id: UUID): OrganisatieView?

    fun getById(id: OrganisatieId): OrganisatieView

    fun existsById(id: UUID): OrganisatieId?
}
