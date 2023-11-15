package com.example.tambaku10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class AboutUs : AppCompatActivity() {
    private var drawerLayout: DrawerLayout? = null

    /*    VideoView videoView;
    Button play;*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        drawerLayout = findViewById(R.id.drawer_layout)
    }

    fun ClickMenu(view: View?) {
        MainActivity.openDrawer(drawerLayout)
    }

    fun ClickLogo(view: View?) {
        MainActivity.closeDrawer(drawerLayout)
    }

    fun ClickHome(view: View?) {
        MainActivity.redirectActivity(this, MainActivity::class.java)
    }

    fun ClickInformasi(view: View?) {
        MainActivity.redirectActivity(this, Informasi::class.java)
    }

    fun ClickMacam(view: View?) {
        MainActivity.redirectActivity(this, Macam::class.java)
    }

    fun ClickAboutUs(view: View?) {
        recreate()
    }

    fun ClickLogout(view: View?) {
        MainActivity.Logout(this)
    }

    public override fun onPause() {
        super.onPause()
        MainActivity.closeDrawer(drawerLayout)
    }
}