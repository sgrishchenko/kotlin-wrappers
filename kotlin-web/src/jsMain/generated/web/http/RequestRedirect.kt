// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RequestRedirect {
    companion object {
        @JsValue("error")
        val error: RequestRedirect

        @JsValue("follow")
        val follow: RequestRedirect

        @JsValue("manual")
        val manual: RequestRedirect
    }
}
