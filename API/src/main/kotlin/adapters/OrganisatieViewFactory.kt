package org.example.adapters

import main.kotlin.OrganisatieView
import org.example.OrganisatieResponse

internal fun OrganisatieView.toOrganisatieResponse(): OrganisatieResponse =
    OrganisatieResponse(
        id = this.id.value.toString(),
        naam = this.naam,
    )
