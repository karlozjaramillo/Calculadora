package com.cj.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven,
            btnEight, btnNine, btnClear, btnPlus, btnSubtract, btnMultiply, btnDivide,
            btnDot, btnEqual;
    private TextView tvResult;
    private Integer num1 = 0;
    private Integer num2 = 0;
    private Integer result;
    private Integer operation = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }

    private void setContentView() {
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        btnPlus = findViewById(R.id.btnPlus);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        tvResult = findViewById(R.id.tvResult);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
    }

    private void pressNumber(String digit) {
        tvResult.setText(tvResult.getText() + digit);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnOne) {
            pressNumber("1");
        }
        if (v.getId() == R.id.btnTwo) {
            pressNumber("2");
        }
        if (v.getId() == R.id.btnThree) {
            pressNumber("3");
        }
        if (v.getId() == R.id.btnFour) {
            pressNumber("4");
        }
        if (v.getId() == R.id.btnFive) {
            pressNumber("5");
        }
        if (v.getId() == R.id.btnSix) {
            pressNumber("6");
        }
        if (v.getId() == R.id.btnSeven) {
            pressNumber("7");
        }
        if (v.getId() == R.id.btnEight) {
            pressNumber("8");
        }
        if (v.getId() == R.id.btnNine) {
            pressNumber("9");
        }
        if (v.getId() == R.id.btnZero) {
            pressNumber("0");
        }
        if (v.getId() == R.id.btnClear) {
            clear();
        }
        if (v.getId() == R.id.btnPlus) {
            add();
        }
        if (v.getId() == R.id.btnSubtract) {
            subtract();
        }
        if (v.getId() == R.id.btnDivide) {
            divide();
        }
        if (v.getId() == R.id.btnMultiply) {
            multiply();
        }
        if (v.getId() == R.id.btnEqual) {
            equal();
        }
    }

    public void clear() {
        tvResult.setText("");
    }

    public void add() {
        num1 = (Integer.parseInt(tvResult.getText().toString()));
        operation = 1;
        clear();
    }

    public void subtract() {
        num1 = (Integer.parseInt(tvResult.getText().toString()));
        operation = 2;
        clear();
    }

    public void divide() {
        num1 = (Integer.parseInt(tvResult.getText().toString()));
        operation = 3;
        clear();
    }

    public void multiply() {
        num1 = (Integer.parseInt(tvResult.getText().toString()));
        operation = 4;
        clear();
    }

    public void equal() {
        num2 = (Integer.parseInt(tvResult.getText().toString()));
        if (operation.equals(1)) {
            result = num1 + num2;
        }
        if (operation.equals(2)) {
            result = num1 - num2;
        }
        if (operation.equals(3)) {
            result = num1 / num2;
        }
        if (operation.equals(4)) {
            result = num1 * num2;
        }
        tvResult.setText(result.toString());
    }
}