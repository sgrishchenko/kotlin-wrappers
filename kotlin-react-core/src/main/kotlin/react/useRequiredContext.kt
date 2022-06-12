package react

fun <T : Any> useRequiredContext(
    context: Context<T?>,
): T =
    useContext(context).let(::requireNotNull)
