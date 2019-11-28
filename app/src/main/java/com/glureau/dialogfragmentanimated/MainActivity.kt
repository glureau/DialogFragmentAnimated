package com.glureau.dialogfragmentanimated

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_view_1.setOnClickListener {
            MyDialogFragment(it.getBounds()).show(supportFragmentManager, "foo")
        }
        image_view_2.setOnClickListener {
            MyDialogFragment(it.getBounds()).show(supportFragmentManager, "foo")
        }
        image_view_3.setOnClickListener {
            MyDialogFragment(it.getBounds()).show(supportFragmentManager, "foo")
        }
    }
}
