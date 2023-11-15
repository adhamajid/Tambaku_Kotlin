package com.example.tambaku10

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class Macam : AppCompatActivity(), View.OnClickListener {
    private var drawerLayout: DrawerLayout? = null
    private val startBtn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_macam)
        drawerLayout = findViewById(R.id.drawer_layout)
        val button1 = findViewById<Button>(R.id.batuk)
        val button2 = findViewById<Button>(R.id.flu)
        val button3 = findViewById<Button>(R.id.demam)
        val button4 = findViewById<Button>(R.id.diare)
        val button5 = findViewById<Button>(R.id.sembelit)
        val button6 = findViewById<Button>(R.id.maag)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
    }

    fun openBatuk() {
        MainActivity.redirectActivity(this, batuk::class.java)
    }

    fun openFlu() {
        MainActivity.redirectActivity(this, flu::class.java)
    }

    fun openDemam() {
        MainActivity.redirectActivity(this, demam::class.java)
    }

    fun openDiare() {
        MainActivity.redirectActivity(this, diare::class.java)
    }

    fun openSembelit() {
        MainActivity.redirectActivity(this, sembelit::class.java)
    }

    fun openMaag() {
        MainActivity.redirectActivity(this, maag::class.java)
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
        MainActivity.redirectActivity(this, Informasi::class.java)
    }

    fun ClickMacam(view: View?) {
        recreate()
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

    override fun onClick(v: View) {
        when (v.id) {
            R.id.batuk -> {
                val categoryIntent = Intent(this@Macam, batuk::class.java)
                startActivity(categoryIntent)
                finish()
            }

            R.id.flu -> {
                val categoryIntent1 = Intent(this@Macam, flu::class.java)
                startActivity(categoryIntent1)
                finish()
            }

            R.id.demam -> {
                val categoryIntent2 = Intent(this@Macam, demam::class.java)
                startActivity(categoryIntent2)
                finish()
            }

            R.id.diare -> {
                val categoryIntent3 = Intent(this@Macam, diare::class.java)
                startActivity(categoryIntent3)
                finish()
            }

            R.id.sembelit -> {
                val categoryIntent4 = Intent(this@Macam, sembelit::class.java)
                startActivity(categoryIntent4)
                finish()
            }

            R.id.maag -> {
                val categoryIntent5 = Intent(this@Macam, maag::class.java)
                startActivity(categoryIntent5)
                finish()
            }
        }
    }
}