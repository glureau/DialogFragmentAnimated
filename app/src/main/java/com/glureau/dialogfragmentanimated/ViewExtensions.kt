package com.glureau.dialogfragmentanimated

import android.graphics.Rect
import android.view.View

fun View.getBounds(): Rect {
    val loc = IntArray(2)
    getLocationOnScreen(loc)
    return Rect(loc[0], loc[1], loc[0] + width, loc[1] + height)
}
