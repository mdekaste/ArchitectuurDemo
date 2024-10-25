package main.kotlin.extensions

fun <R, T1, T2> withNoNulls(
    t1: T1?,
    t2: T2?,
    block: (T1, T2) -> R?,
): R? =
    when {
        t1 != null && t2 != null -> block(t1, t2)
        else -> null
    }
