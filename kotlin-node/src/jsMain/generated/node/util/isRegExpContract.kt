// Generated by Karakum - do not modify it manually!

package node.util

import kotlin.js.RegExp


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isRegExp(`object`: Any?): Boolean /* object is RegExp */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is RegExp)
    }

    return isRegExpRaw(`object`)
}
