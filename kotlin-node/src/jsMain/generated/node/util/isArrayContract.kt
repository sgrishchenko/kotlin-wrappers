// Generated by Karakum - do not modify it manually!

package node.util


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArray(`object`: Any?): Boolean /* object is unknown[] */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is js.array.ReadonlyArray<Any?>)
    }

    return isArrayRaw(`object`)
}
