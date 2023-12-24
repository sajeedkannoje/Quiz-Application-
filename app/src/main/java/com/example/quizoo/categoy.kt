package com.example.quizoo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.category.*

class categoy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category)
        supportActionBar?.hide()
        btndesign.setOnClickListener(){
            var go_question= Intent(this,quesion_design::class.java)
            startActivity(go_question)
        }
        btncyber.setOnClickListener(){
            var go_cyber= Intent(this,backend::class.java)
            startActivity(go_cyber)
        }
        btnmobdev.setOnClickListener(){
            var go_mob= Intent(this,android::class.java)
            startActivity(go_mob)
        }
        btnwebdev.setOnClickListener(){
            var go_web= Intent(this,front::class.java)
            startActivity(go_web)
        }


    }
}