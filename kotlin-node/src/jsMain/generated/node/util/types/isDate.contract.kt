// Generated by Karakum - do not modify it manually!

package node.util.types

import js.date.Date
import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDate(value: Any?): Boolean /* object is Date */ {
    contract {
        returns(true) implies (value is Date)
    }

    return isDateRaw(value)
}
