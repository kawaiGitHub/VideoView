package com.test.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class M2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m2)

        val vv: VideoView =findViewById(R.id.vv)

        val videoPath ="android.resource://"+packageName+"/"+R.raw.m

        val uri = Uri.parse(videoPath)
        vv.setVideoURI(uri)
        vv.requestFocus()

        vv.start()

    }
}