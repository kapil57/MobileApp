package com.example.mytipscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText billEdit = findViewById(R.id.bill);
        final EditText tipEdit = findViewById(R.id.tips);

        final TextView tipView = findViewById(R.id.tipstotal);
        final TextView totalBill = findViewById(R.id.totalbill);

        Button calculate = findViewById(R.id.button);
        Button openSecond = findViewById(R.id.button3);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billString = billEdit.getText().toString();
                float bill = Float.parseFloat(billString);

                String tipString = tipEdit.getText().toString();
                float tip = Float.parseFloat(tipString);

                TipCalculator myCalculator = new TipCalculator(tip,bill);
                tipView.setText("$ "+String.format("%.2f",myCalculator.tipAmount()));
                totalBill.setText("$ "+String.format("%.2f",myCalculator.totalAmount()));
            }
        });

        openSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }
}
