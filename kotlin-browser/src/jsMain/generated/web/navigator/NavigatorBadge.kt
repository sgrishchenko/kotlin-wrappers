// Automatically generated - do not modify!

package web.navigator

import js.core.JsLong
import js.core.Void
import js.promise.Promise

/**
 * Available only in secure contexts.
 */
sealed external interface NavigatorBadge {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
     */
    suspend fun clearAppBadge()

    @JsName("clearAppBadge")
    fun clearAppBadgeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
     */
    suspend fun setAppBadge(contents: JsLong = definedExternally)

    @JsName("setAppBadge")
    fun setAppBadgeAsync(contents: JsLong = definedExternally): Promise<Void>
}
