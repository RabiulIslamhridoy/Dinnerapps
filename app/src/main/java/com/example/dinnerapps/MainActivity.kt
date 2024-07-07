package com.example.dinnerapps

import android.os.Bundle
import android.widget.*
import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dinnerapps.ui.theme.DinnerappsTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodlist= arrayListOf("Chines","Hamburger","Pizza","McDonalds")

   val DisplayFoodname=  findViewById<TextView>(R.id.nameoffood)
        val getfoodname=  findViewById<EditText>(R.id.textview1)

        findViewById<Button>(R.id.addfoodbutton).setOnClickListener {
        val newfood=getfoodname.text.toString()
         foodlist.add(newfood)
        println(foodlist)
            getfoodname.text.clear()
        }

        findViewById<Button>(R.id.declinebtn).setOnClickListener {

            val rendom = Random.nextInt(0, foodlist.size)
            DisplayFoodname.setText(foodlist[rendom])

        }









                }
            }
