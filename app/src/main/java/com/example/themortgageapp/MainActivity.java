package com.example.themortgageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickTheButton (View x) {
        EditText payMoneyV = (EditText) findViewById(R.id.paymon);
        String pm = payMoneyV.getText().toString();
        EditText payPeriodV = (EditText) findViewById(R.id.payper);
        String am = payPeriodV.getText().toString();
        EditText payinterestV = (EditText) findViewById(R.id.payint);
        String im = payinterestV.getText().toString();

        MortgageModel abc = new MortgageModel(pm,am,im);

        ((TextView)findViewById(R.id.result)).setText(abc.computePayment());
    }
}