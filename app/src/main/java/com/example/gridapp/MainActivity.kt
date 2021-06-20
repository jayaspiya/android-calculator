package com.example.gridapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    private lateinit var btnClear: Button
    private lateinit var btnPercent: Button
    private lateinit var btnProcess: Button
    private lateinit var btnDecimal: Button

    // Calculation Logic
    private var firstNum: String = "0"
    private var secondNum: String = "0"
    private var processToDo: String = ""
    private var answer: Double = 0.0
    private var isReset: Boolean = true
    private var isDecimal: Boolean = false
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
        btnClear = findViewById(R.id.btnClear)
        btnPercent = findViewById(R.id.btnPercent)
        btnProcess = findViewById(R.id.btnProcess)
        btnDecimal = findViewById(R.id.btnDecimal)
        btn1.setOnClickListener {
            setNumber("1")
            setOutput()
            isReset = true
        }
        btn2.setOnClickListener {
            setNumber("2")
            setOutput()
            isReset = true
        }
        btn3.setOnClickListener {
            setNumber("3")
            setOutput()
            isReset = true
        }
        btn4.setOnClickListener {
            setNumber("4")
            setOutput()
            isReset = true
        }
        btn5.setOnClickListener {
            setNumber("5")
            setOutput()
            isReset = true
        }
        btn6.setOnClickListener {
            setNumber("6")
            setOutput()
            isReset = true
        }
        btn7.setOnClickListener {
            setNumber("7")
            setOutput()
            isReset = true
        }
        btn8.setOnClickListener {
            setNumber("8")
            setOutput()
            isReset = true
        }
        btn9.setOnClickListener {
            setNumber("9")
            setOutput()
            isReset = true
        }
        btn0.setOnClickListener {
            setNumber("0")
            setOutput()
            isReset = true
        }
        btnDecimal.setOnClickListener {
            setNumber(".")
            setOutput()
            isDecimal = true
            btnDecimal.isEnabled = false
        }
        btnAdd.setOnClickListener {
            processToDo = "+"
            if (!isReset) {
                firstNum = answer.toString()
                isReset = true
            }
            toggleProcessBtn()
            isDecimal = false
            btnDecimal.isEnabled = true
        }
        btnSub.setOnClickListener {
            processToDo = "-"
            if (!isReset) {
                firstNum = answer.toString()
                isReset = true
            }
            toggleProcessBtn()
            isDecimal = false
            btnDecimal.isEnabled = true
        }
        btnProduct.setOnClickListener {
            processToDo = "*"
            if (!isReset) {
                firstNum = answer.toString()
                isReset = true
            }
            toggleProcessBtn()
            isDecimal = false
            btnDecimal.isEnabled = true
        }
        btnClear.setOnClickListener {
            setResult("")
            resetCalc()
            isReset = true
            isDecimal = false
            btnDecimal.isEnabled = true
        }
        btnPercent.setOnClickListener {
            processToDo = "%"
            if (!isReset) {
                firstNum = answer.toString()
                isReset = true
            }
            toggleProcessBtn()
            isDecimal = false
            btnDecimal.isEnabled = true
        }
        btnProcess.setOnClickListener {
            when (processToDo) {
                "+" -> answer = firstNum.toDouble() + secondNum.toDouble()
                "-" -> answer = firstNum.toDouble() - secondNum.toDouble()
                "*" -> answer = firstNum.toDouble() * secondNum.toDouble()
                "%" -> answer = firstNum.toDouble() * 100 / secondNum.toDouble()
            }
            setResult("$answer")
            isReset = false
            isDecimal = false
            btnDecimal.isEnabled = true
            resetCalc()
        }
    }

    private fun setOutput() {
        if (processToDo == "") {
            if (isDecimal) {
                setResult(" ${firstNum.toDouble()} ")
            } else {
                setResult(" ${String.format("%.0f", firstNum.toDouble())}")
            }
        } else {
            if (isDecimal) {
                setResult(" ${secondNum.toDouble()} ")
            } else {
                setResult("${String.format("%.0f", secondNum.toDouble())}")
            }
        }
    }

    private fun setResult(result: String) {
        tvResult.text = result
    }

    private fun setNumber(n: String) {
        if (processToDo == "") {
            firstNum += n
        } else {
            secondNum += n
        }
    }

    private fun resetCalc() {
        firstNum = "0"
        secondNum = "0"
        processToDo = ""
        toggleProcessBtn(true)
    }

    private fun toggleProcessBtn(btnState: Boolean = false) {
        btnAdd.isEnabled = btnState
        btnProduct.isEnabled = btnState
        btnSub.isEnabled = btnState
        btnPercent.isEnabled = btnState
    }
}