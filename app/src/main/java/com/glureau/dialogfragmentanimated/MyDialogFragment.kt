package com.glureau.dialogfragmentanimated

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyDialogFragment(animationStartRect: Rect) : AnimatedDialogFragment(animationStartRect) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.popup_layout, container, false)
    }
}