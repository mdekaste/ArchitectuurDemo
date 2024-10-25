package main.kotlin

import domain.model.OrganisatieInsert

interface OrganisatieService {
    fun verwerk(organisatie: OrganisatieInsert): OrganisatieView
}
