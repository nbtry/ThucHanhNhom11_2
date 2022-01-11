package com.example.maytinh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCong: Button = findViewById(R.id.btnCong)
        btnCong.setOnClickListener {
            var n1: EditText = findViewById(R.id.etNum1)
            var so1: Double = (n1.text.toString()).toDouble()
            var n2: EditText = findViewById(R.id.etNum2)
            var so2: Double = (n2.text.toString()).toDouble()
            val resultText: TextView = findViewById(R.id.tvKetqua)
            resultText.text = Cong(so1, so2).toString()
        }
        val btnTru: Button = findViewById(R.id.btnTru)
        btnTru.setOnClickListener {
            var n1: EditText = findViewById(R.id.etNum1)
            var so1: Double = (n1.text.toString()).toDouble()
            var n2: EditText = findViewById(R.id.etNum2)
            var so2: Double = (n2.text.toString()).toDouble()
            val resultText: TextView = findViewById(R.id.tvKetqua)
            resultText.text = Tru(so1, so2).toString()
        }
        val btnNhan: Button = findViewById(R.id.btnNhan)
        btnNhan.setOnClickListener {
            var n1: EditText = findViewById(R.id.etNum1)
            var so1: Double = (n1.text.toString()).toDouble()
            var n2: EditText = findViewById(R.id.etNum2)
            var so2: Double = (n2.text.toString()).toDouble()
            val resultText: TextView = findViewById(R.id.tvKetqua)
            resultText.text = Nhan(so1, so2).toString()
        }
        val btnChia: Button = findViewById(R.id.btnChia)
        btnChia.setOnClickListener {
            var n1: EditText = findViewById(R.id.etNum1)
            var so1: Double = (n1.text.toString()).toDouble()
            var n2: EditText = findViewById(R.id.etNum2)
            var so2: Double = (n2.text.toString()).toDouble()
            val resultText: TextView = findViewById(R.id.tvKetqua)
            resultText.text = Chia(so1, so2).toString()
        }

    }
}

fun Cong(so1: Double, so2: Double): Double {
    val rs: Double = so1 + so2
    return rs
}
fun Tru(so1: Double, so2: Double): Double {
    val rs: Double = so1 - so2
    return rs
}
fun Nhan(so1: Double, so2: Double): Double {
    val rs: Double = so1 * so2
    return rs
}
fun Chia(so1: Double, so2: Double): Double {
    val rs: Double = so1 / so2
    return rs
}