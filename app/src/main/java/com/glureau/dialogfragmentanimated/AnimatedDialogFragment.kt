package com.glureau.dialogfragmentanimated

import android.animation.Animator
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnLayout
import androidx.fragment.app.DialogFragment

open class AnimatedDialogFragment(
    private val animationInitialRect: Rect,
    private val transitionDuration: Long = 3000
) : DialogFragment() {

    override fun onStart() {
        super.onStart()
        dialog?.window?.decorView?.doOnLayout { decorView ->
            val dialogBounds = decorView.getBounds()
            decorView.scaleX = animationInitialRect.width().toFloat() / dialogBounds.width()
            decorView.scaleY = animationInitialRect.height().toFloat() / dialogBounds.height()
            decorView.translationX = (animationInitialRect.left + animationInitialRect.width() / 2f) -
                    (dialogBounds.left + dialogBounds.width() / 2f)
            decorView.translationY = (animationInitialRect.top + animationInitialRect.height() / 2f) -
                    (dialogBounds.top + dialogBounds.height() / 2f)

            decorView.animate()
                .scaleX(1f)
                .scaleY(1f)
                .translationX(0f)
                .translationY(0f)
                .setDuration(transitionDuration)
                .setListener(object : Animator.AnimatorListener {
                    override fun onAnimationRepeat(animation: Animator?) {

                    }

                    override fun onAnimationEnd(animation: Animator?) {
                        decorView.scaleX = 1f
                        decorView.scaleY = 1f
                        decorView.translationX = 0f
                        decorView.translationY = 0f
                    }

                    override fun onAnimationCancel(animation: Animator?) {
                    }

                    override fun onAnimationStart(animation: Animator?) {
                    }

                })
                .start()

        }
    }
}