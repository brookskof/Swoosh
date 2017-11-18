package org.skof.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_finish.*
import kotlinx.android.synthetic.main.activity_skill.*
import org.skof.swoosh.R
import org.skof.swoosh.Utilities.EXTRA_LEAGUE
import org.skof.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
