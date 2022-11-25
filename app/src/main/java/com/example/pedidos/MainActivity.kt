package com.example.pedidos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.example.pedidos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2 ) as NavHostFragment
        val navController = navHostFragment.navController
        setSupportActionBar(binding.toolbar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.help -> navegarPagina()
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu,menu)
       return true
    }

    private fun navegarPagina(){
        val webpage : Uri = Uri.parse("https://developer.android.com")
        val intent = Intent(Intent.ACTION_VIEW,webpage)
        startActivity(intent)
    }
}