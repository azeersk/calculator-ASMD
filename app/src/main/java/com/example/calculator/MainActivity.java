package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView oneNumber,twoNumber,Answer;
    Button Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneNumber = findViewById(R.id.FirstNumber);
        twoNumber = findViewById(R.id.SecondNumber);
        Answer = findViewById(R.id.textAns);
        Add = findViewById(R.id.Addition);
        Sub = findViewById(R.id.Substraction);
        Mul = findViewById(R.id.Multiplication);
        Div = findViewById(R.id.Divid);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int First = Integer.parseInt(oneNumber.getText().toString());
                int Second = Integer.parseInt(twoNumber.getText().toString());
                int sum = First + Second;
                Answer.setText("Ans is = " + sum);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int First = Integer.parseInt(oneNumber.getText().toString());
                int Second = Integer.parseInt(twoNumber.getText().toString());
                int sum = First - Second;
                Answer.setText("Ans is = " + sum);
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int First = Integer.parseInt(oneNumber.getText().toString());
                int Second = Integer.parseInt(twoNumber.getText().toString());
                int sum = First * Second;
                Answer.setText("Ans is = " + sum);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int First = Integer.parseInt(oneNumber.getText().toString());
                int Second = Integer.parseInt(twoNumber.getText().toString());
                int sum = First/Second;
                Answer.setText("Ans is = " + sum);
            }
        });
    }
}