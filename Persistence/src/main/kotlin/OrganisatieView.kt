package main.kotlin

import main.kotlin.types.Agb
import org.example.OrganisatieId

// kan technisch gezien ook met een losse domain OrganisatieId interface en een infastructuur OrganisatieIdImpl class
class OrganisatieView internal constructor(
    val id: OrganisatieId,
    val agb: Agb,
    val naam: String,
)
