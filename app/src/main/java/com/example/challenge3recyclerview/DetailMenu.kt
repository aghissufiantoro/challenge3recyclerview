package com.example.challenge3recyclerview

import android.annotation.SuppressLint
import android.app.Person
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private fun Intent.putExtra(extraPerson: String) = Unit

class DetailMenu( ) {
    class MainActivity : AppCompatActivity(), View.OnClickListener {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_maps)
            val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
            btnMoveActivity.setOnClickListener(this)

            val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
            btnMoveWithDataActivity.setOnClickListener(this)

            val btnMoveWithObject: Button = findViewById(R.id.btn_move_activity_object)
            btnMoveWithObject.setOnClickListener(this)

            val mapsButton: Button = findViewById(R.id.btn_maps)
            mapsButton.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            when (p0?.id) {
                R.id.btn_move_activity -> {
                    val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                    startActivity(moveIntent)
                }

                R.id.btn_move_activity_data -> {
                    val moveWithDataIntent = Intent(this@MainActivity, MoveWithData::class.java)
                    moveWithDataIntent.putExtra(MoveWithData.EXTRA_NAME, "DicodingAcademy Boy")
                    moveWithDataIntent.putExtra(MoveWithData.EXTRA_AGE, 5)
                    startActivity(moveWithDataIntent)

                }

                R.id.btn_move_activity_object -> {
                    val moveWithObjectIntent =
                        Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                    moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                    startActivity(moveWithObjectIntent)
                }

                R.id.btn_maps -> {
                    val GmapsActivity = Unit
                    val moveMapsIntent = Intent(this@MainActivity, GmapsActivity::class.java)
                    startActivity((moveMapsIntent))
                }
            }
        }

        class MoveActivity {

        }
    }
}