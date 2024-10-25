package org.example.infastructure.factory

import main.kotlin.OrganisatieView
import org.example.infastructure.OrganisatieAangemaaktEvent

fun OrganisatieView.toOrganisatieAangemaaktEvent() =
    OrganisatieAangemaaktEvent(
        id = this.id.value,
        agb = this.agb.value,
        naam = this.naam,
    )
