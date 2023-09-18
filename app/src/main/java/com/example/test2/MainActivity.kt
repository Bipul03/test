package com.example.test2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var drawer=findViewById<DrawerLayout>(R.id.drawerlayout)
        var tool=findViewById<Toolbar>(R.id.toolbar)
       var  navigationview=findViewById<NavigationView>(R.id.nav_vie)

     navigationview.setNavigationItemSelectedListener {
    when(it.itemId){
       R.id.home->{
           Toast.makeText(this, "home", Toast.LENGTH_SHORT).show() }
       R.id.add->{ Toast.makeText(this, "add some item", Toast.LENGTH_SHORT).show() }
       R.id.setting->{ Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show() }

    }
    drawer.close()
    true
}
        tool.setNavigationOnClickListener(){
           drawer.open()
        }


        val buttomnavigation = findViewById<BottomNavigationView>(R.id.buttomnavigation)
//        buttomnavigation.setOnItemReselectedListener {item->
//            when (item.itemId) {
//                R.id.home -> { changeFragment(homeFragment())
//                    true
//                }
//                R.id.add->{changeFragment(AddFragment())
//                true}
//                R.id.setting->{changeFragment(settingsFragment())
//                true}
//
//            }
//
//        }

        buttomnavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    changeFragment(homeFragment())
                    true
                }
                R.id.add -> {
                    changeFragment(AddFragment())
                    true
                }
                R.id.setting -> {
                    changeFragment(settingsFragment())
                    true
                }

                else -> {
                    changeFragment(homeFragment())
                    true
                }
            }
        }
    }

    private fun changeFragment(fragment:Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_cantenner,fragment).commit()
    }


}

