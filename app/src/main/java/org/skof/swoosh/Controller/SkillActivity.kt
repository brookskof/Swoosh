package org.skof.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import org.skof.swoosh.Utilities.EXTRA_LEAGUE
import org.skof.swoosh.R
import org.skof.swoosh.Utilities.EXTRA_SKILL

class SkillActivity :  BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        skill = "baller"
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        skill = "beginner"
    }


    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}
