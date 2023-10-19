package com.example.befit.workout.Chest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.befit.R

class BCW2 : AppCompatActivity() {
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bcw2)
        simpleVideoView = findViewById<View>(R.id.chestExerciseVideo2) as VideoView
        if (mediaControls == null) {
            // creating an object of media controller class
            mediaControls = MediaController(this)

            // set the anchor view for the video view
            mediaControls!!.setAnchorView(this.simpleVideoView)
            simpleVideoView!!.setMediaController(mediaControls)

            // set the absolute path of the video file which is going to be played
            simpleVideoView!!.setVideoURI(
                Uri.parse(
                    "android.resource://"
                            + packageName + "/" + R.raw.beginner_chest_workout2
                )
            )
            simpleVideoView!!.requestFocus()

            // starting the video
            simpleVideoView!!.start()

            // display a toast message
            // after the video is completed
            simpleVideoView!!.setOnCompletionListener {
                Toast.makeText(
                    applicationContext, "Video completed",
                    Toast.LENGTH_LONG
                ).show()
            }
            simpleVideoView!!.setOnErrorListener { mp, what, extra ->
                Toast.makeText(
                    applicationContext, "An Error Occured " +
                            "While Playing Video !!!", Toast.LENGTH_LONG
                ).show()
                false
            }
            val chexSubmit = findViewById<Button>(R.id.chexSubmit01)
            chexSubmit.setOnClickListener {
                val intent = Intent(this, BCW3::class.java)
                startActivity(intent)
            }
        }
    }
}