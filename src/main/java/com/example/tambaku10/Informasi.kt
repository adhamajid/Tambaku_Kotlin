package com.example.tambaku10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class Informasi : AppCompatActivity() {
    private var drawerLayout: DrawerLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)
        drawerLayout = findViewById(R.id.drawer_layout)
    }

    fun ClickMenu(view: View?) {
        MainActivity.openDrawer(drawerLayout)
    }

    fun ClickLogo(view: View?) {
        MainActivity.closeDrawer(drawerLayout)
    }

    fun ClickHome(view: View?) {
        MainActivity.redirectActivity(
            this,
            MainActivity::class.java
        )
    }

    fun ClickInformasi(view: View?) {
        recreate()
    }

    fun ClickMacam(view: View?) {
        MainActivity.redirectActivity(this, Macam::class.java)
    }

    fun ClickAboutUs(view: View?) {
        MainActivity.redirectActivity(this, AboutUs::class.java)
    }

    fun ClickLogout(view: View?) {
        MainActivity.Logout(this)
    }

    public override fun onPause() {
        super.onPause()
        MainActivity.closeDrawer(drawerLayout)
    }
}