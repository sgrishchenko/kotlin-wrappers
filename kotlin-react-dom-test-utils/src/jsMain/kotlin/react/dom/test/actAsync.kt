@file:JsModule("react-dom/test-utils")
@file:JsNonModule

package react.dom.test

import kotlin.js.Promise

@JsName("act")
external fun <T> actAsync(
    callback: () -> T, /* | Promise<T> */
): Promise<T>