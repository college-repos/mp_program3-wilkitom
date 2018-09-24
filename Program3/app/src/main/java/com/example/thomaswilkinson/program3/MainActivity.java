package com.example.thomaswilkinson.program3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
    buttonDecimal, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonNegate, buttonPowerOf, buttonEquals;
    TextView textView1;
    Boolean addPressed = false, subtractPressed = false, multiplyPressed = false, dividePressed = false, powerOfPressed = false;
    Boolean decimalUsed = false;
    Boolean operatorPressed = false;
    Boolean equalsPressed = false;
    double firstNumber, secondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Grab GUI objects from my XML file
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonAdd = findViewById(R.id.buttonPlus);
        buttonSubtract = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonNegate = findViewById(R.id.buttonNegate);
        buttonPowerOf = findViewById(R.id.buttonPowerOf);
        buttonEquals = findViewById(R.id.buttonEquals);
        textView1 = findViewById(R.id.textView);
        //Button 0 listener
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("0");
                    equalsPressed = false;
                }
                 else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("0");
                        operatorPressed = true;
                    }
                    else{
                        if (textView1.getText().toString().trim().equals("0")) {
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "0");
                        }
                    }
                }
            }
        });
        //Button 1 listener
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("1");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("1");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("1");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "1");
                        }
                    }
                }
            }
        });
        //button 2 listener
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("2");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("2");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("2");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "2");
                        }
                    }
                }
            }
        });
        //button 3 listener
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("3");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("3");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("3");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "3");
                        }
                    }
                }
            }
        });
        //button 4 listener
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("4");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("4");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("4");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "4");
                        }
                    }
                }
            }
        });
        //button 5 listener
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("5");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("5");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("5");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "5");
                        }
                    }
                }
            }
        });
        //button 6 listener
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("6");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("6");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("6");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "6");
                        }
                    }
                }
            }
        });
        //button 7 listener
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("7");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("7");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("7");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "7");
                        }
                    }
                }
            }
        });
        //button 8 listener
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("8");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("8");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("8");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "8");
                        }
                    }
                }
            }
        });
        //button 9 listener
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(equalsPressed) {
                    textView1.setText("9");
                    equalsPressed = false;
                }
                else{
                    if(addPressed||subtractPressed||multiplyPressed||dividePressed||powerOfPressed) {
                        textView1.setText("9");
                        operatorPressed = true;
                    }
                    else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText("9");
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + "9");
                        }
                    }
                }
            }
        });
        //buttonDecimal listener
        buttonDecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (!decimalUsed) {
                    if (operatorPressed) {
                        textView1.setText(".");
                        operatorPressed = false;
                        decimalUsed = true;
                    } else {
                        if (textView1.getText().toString().trim().equals("0")) {
                            textView1.setText(".");
                            decimalUsed = true;
                        } else {
                            String currentText = textView1.getText().toString().trim();
                            textView1.setText(currentText + ".");
                            decimalUsed = true;
                        }
                    }
                }
            }
        });
        //buttonAdd listener
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!equalsPressed){
                    if(operatorPressed)
                    {
                        String currentText = textView1.getText().toString().trim();
                        secondNumber = Double.parseDouble(currentText);
                        if(addPressed){
                            firstNumber = firstNumber + secondNumber;
                            addPressed = false;
                        }
                        else if(subtractPressed) {
                            firstNumber = firstNumber - secondNumber;
                            subtractPressed = false;
                        }
                        else if(multiplyPressed) {
                            firstNumber = firstNumber * secondNumber;
                            multiplyPressed = false;
                        }
                        else if(dividePressed){
                            firstNumber = firstNumber/secondNumber;
                            dividePressed = false;
                        }
                        else if(powerOfPressed){
                            firstNumber = Math.pow(firstNumber, secondNumber);
                            powerOfPressed = false;
                        }
                        textView1.setText(String.valueOf(firstNumber));
                        addPressed=true;
                    }
                    else{
                        String currentText = textView1.getText().toString().trim();
                        firstNumber = Double.parseDouble(currentText);
                        addPressed = true;
                        subtractPressed = false;
                        multiplyPressed = false;
                        dividePressed = false;
                        powerOfPressed = false;
                    }
                }
            }
        });
        //buttonSubtract listener
        buttonSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!equalsPressed){
                    if(operatorPressed)
                    {
                        String currentText = textView1.getText().toString().trim();
                        secondNumber = Double.parseDouble(currentText);
                        if(addPressed){
                            firstNumber = firstNumber + secondNumber;
                            addPressed = false;
                        }
                        else if(subtractPressed) {
                            firstNumber = firstNumber - secondNumber;
                            subtractPressed = false;
                        }
                        else if(multiplyPressed) {
                            firstNumber = firstNumber * secondNumber;
                            multiplyPressed = false;
                        }
                        else if(dividePressed){
                            firstNumber = firstNumber/secondNumber;
                            dividePressed = false;
                        }
                        else if(powerOfPressed){
                            firstNumber = Math.pow(firstNumber, secondNumber);
                            powerOfPressed = false;
                        }
                        textView1.setText(String.valueOf(firstNumber));
                        subtractPressed=true;
                    }
                    else{
                        String currentText = textView1.getText().toString().trim();
                        firstNumber = Double.parseDouble(currentText);
                        addPressed = false;
                        subtractPressed = true;
                        multiplyPressed = false;
                        dividePressed = false;
                        powerOfPressed = false;
                    }
                }
            }
        });
        //buttonMultiplyer listener
        buttonMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!equalsPressed){
                    if(operatorPressed)
                    {
                        String currentText = textView1.getText().toString().trim();
                        secondNumber = Double.parseDouble(currentText);
                        if(addPressed){
                            firstNumber = firstNumber + secondNumber;
                            addPressed = false;
                        }
                        else if(subtractPressed) {
                            firstNumber = firstNumber - secondNumber;
                            subtractPressed = false;
                        }
                        else if(multiplyPressed) {
                            firstNumber = firstNumber * secondNumber;
                            multiplyPressed = false;
                        }
                        else if(dividePressed){
                            firstNumber = firstNumber/secondNumber;
                            dividePressed = false;
                        }
                        else if(powerOfPressed){
                            firstNumber = Math.pow(firstNumber, secondNumber);
                            powerOfPressed = false;
                        }
                        textView1.setText(String.valueOf(firstNumber));
                        multiplyPressed=true;
                    }
                    else{
                        String currentText = textView1.getText().toString().trim();
                        firstNumber = Double.parseDouble(currentText);
                        addPressed = false;
                        subtractPressed = false;
                        multiplyPressed = true;
                        dividePressed = false;
                        powerOfPressed = false;
                    }
                }
            }
        });
        //buttonDivide listener
        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!equalsPressed) {
                    if (operatorPressed) {
                        String currentText = textView1.getText().toString().trim();
                        secondNumber = Double.parseDouble(currentText);
                        if (addPressed) {
                            firstNumber = firstNumber + secondNumber;
                            addPressed = false;
                        } else if (subtractPressed) {
                            firstNumber = firstNumber - secondNumber;
                            subtractPressed = false;
                        } else if (multiplyPressed) {
                            firstNumber = firstNumber * secondNumber;
                            multiplyPressed = false;
                        } else if (dividePressed) {
                            firstNumber = firstNumber / secondNumber;
                            dividePressed = false;
                        } else if (powerOfPressed) {
                            firstNumber = Math.pow(firstNumber, secondNumber);
                            powerOfPressed = false;
                        }
                        textView1.setText(String.valueOf(firstNumber));
                        dividePressed = true;
                    } else {
                        String currentText = textView1.getText().toString().trim();
                        firstNumber = Double.parseDouble(currentText);
                        addPressed = false;
                        subtractPressed = false;
                        multiplyPressed = false;
                        dividePressed = true;
                        powerOfPressed = false;
                    }
                }
            }
        });
        //buttonPowerOf listener
        buttonPowerOf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!equalsPressed){
                    if(operatorPressed)
                    {
                        String currentText = textView1.getText().toString().trim();
                        secondNumber = Double.parseDouble(currentText);
                        if(addPressed){
                            firstNumber = firstNumber + secondNumber;
                            addPressed = false;
                        }
                        else if(subtractPressed) {
                            firstNumber = firstNumber - secondNumber;
                            subtractPressed = false;
                        }
                        else if(multiplyPressed) {
                            firstNumber = firstNumber * secondNumber;
                            multiplyPressed = false;
                        }
                        else if(dividePressed){
                            firstNumber = firstNumber/secondNumber;
                            dividePressed = false;
                        }
                        else if(powerOfPressed){
                            firstNumber = Math.pow(firstNumber, secondNumber);
                            powerOfPressed = false;
                        }
                        textView1.setText(String.valueOf(firstNumber));
                        powerOfPressed=true;
                    }
                    else{
                        String currentText = textView1.getText().toString().trim();
                        firstNumber = Double.parseDouble(currentText);
                        addPressed = false;
                        subtractPressed = false;
                        multiplyPressed = false;
                        dividePressed = false;
                        powerOfPressed = true;
                    }
                }
            }
        });
        //buttonNegate listener
        buttonNegate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(operatorPressed)
                {

                }
                else{

                }
            }
        });
        //buttonNegate listener
        buttonEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(operatorPressed)
                {
                    String currentText = textView1.getText().toString().trim();
                    secondNumber = Double.parseDouble(currentText);
                    if(addPressed){
                        firstNumber = firstNumber + secondNumber;
                        addPressed = false;
                    }
                    else if(subtractPressed) {
                        firstNumber = firstNumber - secondNumber;
                        subtractPressed = false;
                    }
                    else if(multiplyPressed) {
                        firstNumber = firstNumber * secondNumber;
                        multiplyPressed = false;
                    }
                    else if(dividePressed){
                        firstNumber = firstNumber/secondNumber;
                        dividePressed = false;
                    }
                    else if(powerOfPressed){
                        firstNumber = Math.pow(firstNumber, secondNumber);
                        powerOfPressed = false;
                    }
                    textView1.setText(String.valueOf(firstNumber));
                    operatorPressed = false;
                    equalsPressed = true;
                }
                else{

                }
            }
        });
    }
}
