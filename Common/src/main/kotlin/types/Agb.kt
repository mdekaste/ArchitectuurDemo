package main.kotlin.types

data class Agb internal constructor(
    val value: String,
) {
    init {
        require(validate(value)) { FOUTMELDING }
    }

    companion object {
        fun validate(agb: String): Boolean = agb.length == 6

        operator fun invoke(agb: String) = agb.takeIf(Companion::validate)?.let(::Agb)

        const val FOUTMELDING = "Ongeldige AGB"
    }
}
