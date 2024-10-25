package org.example.adapters

import domain.model.OrganisatieInsert
import main.kotlin.extensions.withNoNulls
import main.kotlin.types.Agb
import org.example.OrganisatiePost

internal fun OrganisatiePost.toOrganisatieInsert(): OrganisatieInsert? =
    withNoNulls(Agb(agb), naam) { agb, naam ->
        OrganisatieInsert(
            agb = agb,
            naam = naam,
        )
    }
