package com.example.a7_congratulations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.ViewAnimator
import java.util.Random

class game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
       var contados=3
        var si=Random()


        val number1:TextView=findViewById(R.id.img_b_1)
        val reintentar:ImageButton=findViewById(R.id.buton_reintentar)
        val contamelo:TextView=findViewById(R.id.CONTADOR)
        val number2:TextView=findViewById(R.id.img_b_2)
        val number3:TextView=findViewById(R.id.img_b_3)
        val informacion:TextView=findViewById(R.id.txt_informador)
        val plei:ImageButton=findViewById(R.id.start_buton)
        val who:ImageButton=findViewById(R.id.persona)
        reintentar.visibility=View.GONE

        plei.setOnClickListener {
            val numero1:Int=si.nextInt(10)
            val numero2:Int=si.nextInt(10)
            val numero3:Int=si.nextInt(10)

            if(numero1==(7)&&numero2==(7)&&numero3==(7)){
                plei.visibility= View.GONE
                reintentar.visibility=View.VISIBLE
                informacion.setText("LO HAS LOGRADO FELICIDADES")
                number1.text=numero1.toString()
                number2.text=numero2.toString()
                number3.text=numero3.toString()
            }

            else{

                if(contados==0){
                informacion.setText("SIGUELO INTENTANDO")
                plei.visibility= View.GONE
                reintentar.visibility=View.VISIBLE


            }
                else{
                    number1.text=numero1.toString()
                    number2.text=numero2.toString()
                    number3.text=numero3.toString()
                    contados--
                    contamelo.setText(contados.toString())
                }

                }




        }


        reintentar.setOnClickListener {
            contados=3
            plei.visibility= View.VISIBLE
            reintentar.visibility=View.GONE
            contamelo.setText("3")
            informacion.setText("")
        }

        who.setOnClickListener {
            val intent= Intent(this,name::class.java)
            startActivity(intent)
        }





    }





}