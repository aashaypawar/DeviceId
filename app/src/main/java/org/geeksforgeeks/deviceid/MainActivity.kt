package org.geeksforgeeks.deviceid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing a constant for the TextView from the layout file (activity_main.xml)
        val mTextView1 = findViewById<TextView>(R.id.textview_1)

        // Fetching Android ID and storing it into a constant
        val mId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)

        // Displaying the Android ID into the TextView
        mTextView1.text = mId
    }
}