@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import js.core.Record

/**
 * Returns a path with params interpolated.
 *
 * @see https://reactrouter.com/docs/en/v6/utils/generate-path
 */
external fun generatePath(path: String, params: Record<String, String> = definedExternally): String
