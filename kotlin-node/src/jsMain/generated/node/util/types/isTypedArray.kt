// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is a built-in [`TypedArray`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray) instance.
 *
 * ```js
 * util.types.isTypedArray(new ArrayBuffer());  // Returns false
 * util.types.isTypedArray(new Uint8Array());  // Returns true
 * util.types.isTypedArray(new Float64Array());  // Returns true
 * ```
 *
 * See also [`ArrayBuffer.isView()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/isView).
 * @since v10.0.0
 */
external fun isTypedArray(`object`: Any?): Boolean /* object is NodeJS.TypedArray */
