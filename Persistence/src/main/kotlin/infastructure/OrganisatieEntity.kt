@file:Suppress("ktlint:standard:no-wildcard-imports")

package infastructure

import java.util.*

internal class OrganisatieEntity(
    val agb: String,
    val naam: String,
) {
    val id: UUID = UUID.randomUUID()
}
