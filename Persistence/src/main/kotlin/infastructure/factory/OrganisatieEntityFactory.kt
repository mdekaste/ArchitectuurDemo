package org.example.infastructure.factory

import domain.model.OrganisatieInsert
import infastructure.OrganisatieEntity
import main.kotlin.OrganisatieView
import main.kotlin.types.Agb
import org.example.OrganisatieId

internal fun OrganisatieInsert.toEntity(): OrganisatieEntity =
    OrganisatieEntity(
        agb = this.agb.value,
        naam = this.naam,
    )

internal fun OrganisatieEntity.toView(): OrganisatieView =
    OrganisatieView(
        id = OrganisatieId(this.id),
        agb = Agb(this.agb) ?: error(Agb.FOUTMELDING),
        naam = this.naam,
    )
