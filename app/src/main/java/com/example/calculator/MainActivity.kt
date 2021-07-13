package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var button0: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var buttonAdd: Button
    private lateinit var buttonSub: Button
    private lateinit var buttonMul: Button
    private lateinit var buttonDiv: Button
    private lateinit var buttonC: Button
    private lateinit var buttonEqual: Button

    private lateinit var displayText: TextView
    private lateinit var textVal: String
    private lateinit var strNum: String
    private lateinit var operation: String

    //function for handling the operations
    fun applyOp(operation: String,result: Int,strNum: String):Int{
        val ans: Int
        if(operation=="+"){
            ans = result+strNum.toInt()
        }
        else if(operation=="-"){
            ans = result-strNum.toInt()
        }
        else if(operation=="x"){
            ans = result*strNum.toInt()
        }
        else if(operation=="/"){
            ans = result/strNum.toInt()
        }
        else{
            ans = result+strNum.toInt()
        }
        return ans
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //assigning the buttons and textView to obj
        button0 = findViewById(R.id.btn0)
        button1 = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)
        button3 = findViewById(R.id.btn3)
        button4 = findViewById(R.id.btn4)
        button5 = findViewById(R.id.btn5)
        button6 = findViewById(R.id.btn6)
        button7 = findViewById(R.id.btn7)
        button8 = findViewById(R.id.btn8)
        button9 = findViewById(R.id.btn9)
        buttonAdd = findViewById(R.id.btnAdd)
        buttonSub = findViewById(R.id.btnSub)
        buttonMul = findViewById(R.id.btnMul)
        buttonDiv = findViewById(R.id.btnDiv)
        buttonC = findViewById(R.id.btnC)
        buttonEqual = findViewById(R.id.btnEqual)
        displayText = findViewById(R.id.textView)

        //set default textView as empty
        textVal = ""
        displayText.text = textVal
        // setting a variable for storing the results
        var result: Int = 0
        strNum = ""
        operation = "+" //default operation has to be addition
        // adding logic and onClickListeners to the buttons

        button0.setOnClickListener {
            strNum+="0"
            textVal+="0"
            displayText.text=textVal
        }
        button1.setOnClickListener {
            strNum+="1"
            textVal+="1"
            displayText.text=textVal
        }
        button2.setOnClickListener {
            strNum+="2"
            textVal+="2"
            displayText.text=textVal
        }
        button3.setOnClickListener {
            strNum+="3"
            textVal+="3"
            displayText.text=textVal
        }
        button4.setOnClickListener {
            strNum+="4"
            textVal+="4"
            displayText.text=textVal
        }
        button5.setOnClickListener {
            strNum+="5"
            textVal+="5"
            displayText.text=textVal
        }
        button6.setOnClickListener {
            strNum+="6"
            textVal+="6"
            displayText.text=textVal
        }
        button7.setOnClickListener {
            strNum+="7"
            textVal+="7"
            displayText.text=textVal
        }
        button8.setOnClickListener {
            strNum+="8"
            textVal+="8"
            displayText.text=textVal
        }
        button9.setOnClickListener {
            strNum+="9"
            textVal+="9"
            displayText.text=textVal
        }
        buttonAdd.setOnClickListener {
            textVal+="+"
            displayText.text=textVal
            result=applyOp(operation,result,strNum)
            operation="+"
            strNum=""
        }
        buttonSub.setOnClickListener {
            textVal+="-"
            displayText.text=textVal
            result=applyOp(operation,result,strNum)
            operation="-"
            strNum=""
        }
        buttonMul.setOnClickListener {
            textVal+="x"
            displayText.text=textVal
            result=applyOp(operation,result,strNum)
            operation="x"
            strNum=""
        }
        buttonDiv.setOnClickListener {
            textVal+="/"
            displayText.text=textVal
            result=applyOp(operation,result,strNum)
            operation="/"
            strNum=""
        }
        buttonC.setOnClickListener {
            strNum+=""
            result=0
            textVal=""
            displayText.text=textVal
            operation="+"
        }
        buttonEqual.setOnClickListener {
            result=applyOp(operation,result,strNum)
            textVal=result.toString()
            displayText.text=textVal
            strNum="0"
            operation="+"
        }

    }
}