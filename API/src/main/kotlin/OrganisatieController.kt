package org.example

import main.kotlin.OrganisatieService
import org.example.adapters.toOrganisatieInsert
import org.example.adapters.toOrganisatieResponse

internal class OrganisatieController(
    private val organisatieService: OrganisatieService,
) {
    fun postOrganisatie(organisatieRequest: OrganisatiePost): OrganisatieResponse? {
        val organisatieInsert = organisatieRequest.toOrganisatieInsert() ?: return null
        return organisatieService
            .verwerk(organisatieInsert)
            .toOrganisatieResponse()
    }
}
