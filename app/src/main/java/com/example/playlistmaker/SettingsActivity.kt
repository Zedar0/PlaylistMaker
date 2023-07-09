package com.example.playlistmaker

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "IntentReset")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val imageReturn = findViewById<ImageView>(R.id.return_button)
        imageReturn.setOnClickListener {
        finish()
        }
        val shareApp = findViewById<FrameLayout>(R.id.button_share_app)
        shareApp.setOnClickListener{
           val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.practicum_link))
            shareIntent.setType("text/plain")
            startActivity(Intent.createChooser(shareIntent, null))
        }
        val sendToSupport = findViewById<FrameLayout>(R.id.button_send_to_support)
        sendToSupport.setOnClickListener {
                Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(getString(R.string.my_email)))
                putExtra(Intent.EXTRA_TEXT, getString(R.string.email_text) )
                putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_theme))
                startActivity(this)
            }
        }
        val userAgreement = findViewById<FrameLayout>(R.id.button_user_agreement)
        userAgreement.setOnClickListener {
            val userAgreementIntent = Intent(Intent.ACTION_VIEW)
            userAgreementIntent.setData(Uri.parse(getString(R.string.user_agreement_link)))
            startActivity(userAgreementIntent)
        }

    }
}