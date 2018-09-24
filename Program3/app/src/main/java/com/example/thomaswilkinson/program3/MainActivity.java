package com.example.thomaswilkinson.program3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
    buttonDecimal, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonNegate, buttonPowerOf;
    TextView textView1;
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
        textView1 = findViewById(R.id.textView);

        //Button 0 listener
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //When button is clicked, check that each of the value fields has input from user. Otherwise, toast and reset.
                if(textView1.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(tip.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else if(splits.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //If all value locations valid, pull values from value fields. Send to dialog function.

                    Double billAmt = Double.parseDouble(bill.getText().toString());
                    Double tipAmt = Double.parseDouble(tip.getText().toString());
                    Double splitAmt = Double.parseDouble(splits.getText().toString());
                    noRoundDialog(1, billAmt, tipAmt, splitAmt);
                }
            }
        });
    }
}
