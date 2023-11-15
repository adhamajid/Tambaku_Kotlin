package com.example.tambaku10

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    //Initialize variable
    private var drawerLayout: DrawerLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Assign variable
        drawerLayout = findViewById(R.id.drawer_layout)
    }

    fun ClickMenu(view: View?) {
        //Open drawer
        openDrawer(drawerLayout)
    }

    fun ClickLogo(view: View?) {
        //Close drawer
        closeDrawer(drawerLayout)
    }

    fun ClickHome(view: View?) {
        //Recreate activity
        recreate()
    }

    fun ClickInformasi(view: View?) {
        redirectActivity(this, Informasi::class.java)
    }

    fun ClickMacam(view: View?) {
        redirectActivity(this, Macam::class.java)
    }

    fun ClickAboutUs(view: View?) {
        redirectActivity(this, AboutUs::class.java)
    }

    fun ClickLogout(view: View?) {
        Logout(this)
    }

    override fun onPause() {
        super.onPause()
        closeDrawer(drawerLayout)
    }

    companion object {
        fun openDrawer(drawerLayout: DrawerLayout?) {
            //Open drawer layout
            drawerLayout!!.openDrawer(GravityCompat.START)
        }

        fun closeDrawer(drawerLayout: DrawerLayout?) {
            //close drawer layout
            //check condition
            if (drawerLayout!!.isDrawerOpen(GravityCompat.START)) {
                //when drawer is open
                //close drawer
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }

        fun Logout(activity: Activity) {
            val builder = AlertDialog.Builder(activity)
            builder.setTitle("Exit")
            builder.setMessage("Yakin Anda Keluar ?")
            builder.setPositiveButton("Iya") { dialog, which -> //Finish
                activity.finishAffinity()
                System.exit(0)
            }
            builder.setNegativeButton("Tidak") { dialog, which -> dialog.dismiss() }
            builder.show()
        }

        fun redirectActivity(activity: Activity, aClass: Class<*>?) {
            //initialize intent
            val intent = Intent(activity, aClass)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            activity.startActivity(intent)
        }
    }
}