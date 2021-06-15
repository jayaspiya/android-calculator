package com.example.gridapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
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
        btn1.setOnClickListener{}
        btn2.setOnClickListener{}
        btn3.setOnClickListener{}
        btn4.setOnClickListener{}
        btn5.setOnClickListener{}
        btn6.setOnClickListener{}
        btn7.setOnClickListener{}
        btn8.setOnClickListener{}
        btn9.setOnClickListener{}
        btn0.setOnClickListener{}
        btnAdd.setOnClickListener{}
        btnSub.setOnClickListener{}
        btnProduct.setOnClickListener{}
        btnDot.setOnClickListener{}
        btnPercent.setOnClickListener{}
        btnProcess.setOnClickListener{}
    }
}