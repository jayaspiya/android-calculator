package com.example.gridapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn0: Button
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnProduct: Button
    private lateinit var btnDot: Button
    private lateinit var btnPercent: Button
    private lateinit var btnProcess: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult = findViewById(R.id.tvResult)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnProduct = findViewById(R.id.btnProduct)
        btnDot = findViewById(R.id.btnDot)
        btnPercent = findViewById(R.id.btnPercent)
        btnProcess = findViewById(R.id.btnProcess)
        btn1.setOnClickListener {
            setResult("1")
        }
        btn2.setOnClickListener {
            setResult("2")
        }
        btn3.setOnClickListener {
            setResult("3")
        }
        btn4.setOnClickListener {
            setResult("4")
        }
        btn5.setOnClickListener {
            setResult("5")
        }
        btn6.setOnClickListener {
            setResult("6")
        }
        btn7.setOnClickListener {
            setResult("7")
        }
        btn8.setOnClickListener {
            setResult("8")
        }
        btn9.setOnClickListener {
            setResult("9")
        }
        btn0.setOnClickListener {
            setResult("0")
        }
        btnAdd.setOnClickListener {
            setResult("add")
        }
        btnSub.setOnClickListener {
            setResult("subtract")
        }
        btnProduct.setOnClickListener {
            setResult("product")
        }
        btnDot.setOnClickListener {
            setResult("dot")
        }
        btnPercent.setOnClickListener {
            setResult("percent")

        }
        btnProcess.setOnClickListener {
            setResult("Process")
        }
    }

    private fun setResult(result: String) {
        tvResult.text = result
    }
}