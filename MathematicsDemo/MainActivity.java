package com.example.akshay.mathematicsdemo;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int num1,num2,reslt;
    EditText first_num,second_num;
    Button plus,sub,mult,div,clrscr;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_num = findViewById(R.id.fnum_id);
        second_num = findViewById(R.id.snum_id);
        resultText = findViewById(R.id.result_id);

        plus = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        clrscr = findViewById(R.id.clrscr_id);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mult();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div();
            }
        });
        clrscr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
    }

    private void Add()
    {
        num1 = Integer.parseInt(first_num.getText().toString());
        num2 = Integer.parseInt(second_num.getText().toString());
        reslt = num1+num2;
        resultText.setText("Addition = "+reslt);

    }

    private void Sub()
    {
        num1 = Integer.parseInt(first_num.getText().toString());
        num2 = Integer.parseInt(second_num.getText().toString());
        reslt = num1-num2;
        resultText.setText("Subtraction = "+reslt);
    }
    private void Mult()
    {
        num1 = Integer.parseInt(first_num.getText().toString());
        num2 = Integer.parseInt(second_num.getText().toString());
        reslt = num1*num2;
        resultText.setText("multiplication = "+reslt);
    }
    private void Div()
    {
        num1 = Integer.parseInt(first_num.getText().toString());
        num2 = Integer.parseInt(second_num.getText().toString());
        double division = (double) num1/num2;
        resultText.setText("Division = "+division);
    }
    private void Clear()
    {
        resultText.setText("0");
    }

}

