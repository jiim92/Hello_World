package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Integer number1 = 0;
    private Integer number2 = 0;
    private Integer result = 0;
    private Integer operator = 0; // 1 für +, 2 für -, 3 für * und 4 für /

    private Button bZero;
    private Button bOne;
    private Button bTwo;
    private Button bThree;
    private Button bFour;
    private Button bFive;
    private Button bSix;
    private Button bSeven;
    private Button bEight;
    private Button bNine;
    private Button bPlus;
    private Button bMinus;
    private Button bMultiply;
    private Button bDivide;
    private Button bEquals;
    private Button bClear;

    private TextView tvNumber1;
    private TextView tvOperator;
    private TextView tvNumber2;
    private TextView tvEqual;
    private TextView tvResult;

    // Meine erste App - Das ist die Java-Datei zur Hauptoberfläche
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bZero = this.findViewById(R.id.bZero);
        this.bOne = this.findViewById(R.id.bOne);
        this.bTwo = this.findViewById(R.id.bTwo);
        this.bThree = this.findViewById(R.id.bThree);
        this.bFour = this.findViewById(R.id.bFour);
        this.bFive = this.findViewById(R.id.bFive);
        this.bSix = this.findViewById(R.id.bSix);
        this.bSeven = this.findViewById(R.id.bSeven);
        this.bEight = this.findViewById(R.id.bEight);
        this.bNine = this.findViewById(R.id.bNine);
        this.bPlus = this.findViewById(R.id.bPlus);
        this.bMinus = this.findViewById(R.id.bMinus);
        this.bMultiply = this.findViewById(R.id.bMultiply);
        this.bDivide = this.findViewById(R.id.bDivide);
        this.bEquals = this.findViewById(R.id.bEquals);
        this.bClear = this.findViewById(R.id.bClear);

        this.tvNumber1=this.findViewById(R.id.tvNumber1);
        this.tvOperator=this.findViewById(R.id.tvOperator);
        this.tvNumber2=this.findViewById(R.id.tvNumber2);
        this.tvEqual=this.findViewById(R.id.tvEqual);
        this.tvResult=this.findViewById(R.id.tvResult);

        this.bZero.setOnClickListener(this);
        this.bOne.setOnClickListener(this);
        this.bTwo.setOnClickListener(this);
        this.bThree.setOnClickListener(this);
        this.bFour.setOnClickListener(this);
        this.bFive.setOnClickListener(this);
        this.bSix.setOnClickListener(this);
        this.bSeven.setOnClickListener(this);
        this.bEight.setOnClickListener(this);
        this.bNine.setOnClickListener(this);
        this.bPlus.setOnClickListener(this);
        this.bMinus.setOnClickListener(this);
        this.bMultiply.setOnClickListener(this);
        this.bDivide.setOnClickListener(this);
        this.bEquals.setOnClickListener(this);
        this.bClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button clicked = (Button) v;

        if(clicked.getId() == this.bZero.getId()){
            number2 = number2*10 + 0;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bOne.getId()){
            number2 = number2*10 + 1;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bTwo.getId()){
            number2 = number2*10 + 2;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bThree.getId()){
            number2 = number2*10 + 3;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bFour.getId()){
            number2 = number2*10 + 4;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bFive.getId()){
            number2 = number2*10 + 5;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bSix.getId()){
            number2 = number2*10 + 6;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bSeven.getId()){
            number2 = number2*10 + 7;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bEight.getId()){
            number2 = number2*10 + 8;
            this.tvNumber2.setText(number2.toString());
        }
        if(clicked.getId() == this.bNine.getId()){
            number2 = number2*10 + 9;
            this.tvNumber2.setText(number2.toString());
        }

        if(clicked.getId() == this.bPlus.getId()){
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 1;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("+");
        }

        if(clicked.getId() == this.bMinus.getId()){
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 2;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("-");
        }

        if(clicked.getId() == this.bMultiply.getId()){
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 3;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("*");
        }

        if(clicked.getId() == this.bPlus.getId()){
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 4;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("/");
        }

        

    }
}
