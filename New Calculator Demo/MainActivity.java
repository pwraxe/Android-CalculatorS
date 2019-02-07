package com.example.akshay.newcalculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first,math_result;
    Button Bone,Btwo,Bthree,Bfour,Bfive,Bsix,Bseven,Beight,Bnine,Bzero,Bclear,Badd,Bsub,Bmult,Bdiv,Bequal;


    boolean isAddition,isSubstraction,isMultiplication,isDivision;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first_id);
        math_result = findViewById(R.id.result_id);

        Bzero = findViewById(R.id.button_zero);
        Bone = findViewById(R.id.button_one);
        Btwo = findViewById(R.id.button_two);
        Bthree = findViewById(R.id.button_three);
        Bfour = findViewById(R.id.button_four);
        Bfive = findViewById(R.id.button_five);
        Bsix = findViewById(R.id.button_six);
        Bseven = findViewById(R.id.button_seven);
        Beight = findViewById(R.id.button_eight);
        Bnine = findViewById(R.id.button_nine);
        Badd = findViewById(R.id.button_add);
        Bsub = findViewById(R.id.button_sub);
        Bmult = findViewById(R.id.button_mult);
        Bdiv = findViewById(R.id.button_div);
        Bclear = findViewById(R.id.button_clear);
        Bequal = findViewById(R.id.button_equal);


        math_result.setEnabled(false);
        Bzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"0");
            }
        });

        Bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"1");
            }
        });

        Btwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"2");
            }
        });
        Bthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"3");
            }
        });
        Bfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"4");
            }
        });
        Bfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"5");
            }
        });
        Bsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"6");
            }
        });
        Bseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"7");
            }
        });
        Beight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"8");
            }
        });
        Bnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(first.getText()+"9");
            }
        });


        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(first.getText().toString());
                isAddition = true;
                math_result.setText(num1+"");
                first.setText(null);

            }
        });
        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(first.getText().toString());
                isSubstraction = true;
                math_result.setText(num1+"");
                first.setText(null);

            }
        });
        Bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(first.getText().toString());
                isMultiplication = true;
                math_result.setText(num1+"");
                first.setText(null);

            }
        });
        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(first.getText().toString());
                isDivision = true;
                math_result.setText(num1+"");
                first.setText(null);

            }
        });
        Bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("");

            }
        });



        Bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAddition == true)
                {
                    num2 = Integer.parseInt(first.getText().toString());
                    math_result.setText(num1+num2+"");
                    isAddition = false;
                    first.setText("");
                }
                if(isSubstraction == true)
                {
                    num2 = Integer.parseInt(first.getText().toString());
                    math_result.setText(num1-num2+"");
                    isSubstraction = false;
                    first.setText("");
                }
                if(isMultiplication == true)
                {
                    num2 = Integer.parseInt(first.getText().toString());
                    math_result.setText(num1*num2+"");
                    isMultiplication = false;
                    first.setText("");
                }
                if(isDivision == true)
                {
                    try {
                        num2 = Integer.parseInt(first.getText().toString());

                        double real = (double) num1/num2;
                        math_result.setText(real+"");
                        isDivision = false;
                        first.setText("");
                    }catch (ArithmeticException e)
                    {
                        Toast.makeText(MainActivity.this,"Couldn't devide by zero",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
