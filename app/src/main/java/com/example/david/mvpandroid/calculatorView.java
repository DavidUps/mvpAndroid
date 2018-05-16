package com.example.david.mvpandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculatorView extends AppCompatActivity implements calculatorInterface.View {

    TextView tvResult;
    Button btnSum,btnRest;
    EditText etOp1, etOp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_view);

        btnSum      = findViewById(R.id.btnSum);
        btnRest     = findViewById(R.id.btnRest);
        etOp1       = findViewById(R.id.etOp1);
        etOp2       = findViewById(R.id.etOp2);
        tvResult    = findViewById(R.id.tvResult);
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }
}
