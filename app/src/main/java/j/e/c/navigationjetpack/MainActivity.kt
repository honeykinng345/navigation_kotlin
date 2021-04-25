package j.e.c.navigationjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      setSupportActionBar(toolbar)

        val  navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment


        navController = navHostFragment.navController

        setupActionBarWithNavController(navController)

        //toolbar.setupWithNavController(navController)

    }


    override fun onNavigateUp(): Boolean {
        return  navController.navigateUp() || super.onSupportNavigateUp()
    }
}

