// Generated by Karakum - do not modify it manually!

@file:JsModule("react-router-dom")

package react.router.dom

import remix.run.router.To
import web.dom.Element

/**
 * Handles the click behavior for router `<Link>` components. This is useful if
 * you need to create custom `<Link>` components with the same click behavior we
 * use in our exported `<Link>`.
 */
external fun <E : Element /* default is HTMLAnchorElement */> useLinkClickHandler(
    to: To,
    options: UseLinkClickHandlerOptions = definedExternally,
): (event: react.dom.events.MouseEvent<E, *>) -> Unit
