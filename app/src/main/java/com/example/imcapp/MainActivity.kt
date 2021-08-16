package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w( "lifecycle", "entrei no CREATE - estou criando a tela")
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w( "lifecycle", "entrei no START - deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w( "lifecycle", "entrei no RESUME - agora você pode interagir com a tela")
    }

    override fun onPause(){
        super.onPause()
        Log.w( "lifecycle", "entrei no PAUSE - a tela perdeu o foco, você não pode mais interagis")
    }

    override fun onStop(){
        Log.w( "lifecycle", "STOP - a tela não está mais visível mas ainda existe")
        super.onStop()
    }

    override fun onDestroy() {
        Log.w("lifecycle", "\nDESTROY - oh não! a tela foi destruída")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.w("lifecycle", "\nRESTART - a tela está retomando o foco")
        super.onRestart()
    }
}
