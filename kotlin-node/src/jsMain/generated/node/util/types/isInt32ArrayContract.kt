// Generated by Karakum - do not modify it manually!

package node.util.types

import js.typedarrays.Int32Array


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isInt32Array(`object`: Any?): Boolean /* object is Int32Array */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Int32Array)
    }

    return isInt32ArrayRaw(`object`)
}
