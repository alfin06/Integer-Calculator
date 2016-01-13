package com.example.alfin.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button  one,
            two,
            three,
            four,
            five,
            six,
            seven,
            eight,
            nine,
            zero,
            add,
            subtract,
            multiply,
            divide,
            modulus,
            delete,
            equal;
    int[]   number = {0,1,2,3,4,5,6,7,8,9};
    int[]   numeric;
    int     total = 0;
    String  calculation = "",
            num,
            operator;
    TextView textCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one         = (Button)findViewById(R.id.one);
        two         = (Button)findViewById(R.id.two);
        three       = (Button)findViewById(R.id.three);
        four        = (Button)findViewById(R.id.four);
        five        = (Button)findViewById(R.id.five);
        six         = (Button)findViewById(R.id.six);
        seven       = (Button)findViewById(R.id.seven);
        eight       = (Button)findViewById(R.id.eight);
        nine        = (Button)findViewById(R.id.nine);
        zero        = (Button)findViewById(R.id.zero);
        add         = (Button)findViewById(R.id.plus);
        subtract    = (Button)findViewById(R.id.minus);
        multiply    = (Button)findViewById(R.id.times);
        divide      = (Button)findViewById(R.id.divides);
        modulus     = (Button)findViewById(R.id.modulus);
        equal       = (Button)findViewById(R.id.equal);
        textCalc    = (TextView)findViewById(R.id.result);
        delete      = (Button)findViewById(R.id.delete);

        zero.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "0";
                calculation += Integer.toString(number[0]);
                showOnScreen(calculation);
            }

        });

        one.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "1";
                calculation += Integer.toString(number[1]);
                showOnScreen(calculation);
            }

        });

        two.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "2";
                calculation += Integer.toString(number[2]);
                showOnScreen(calculation);
            }

        });

        three.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "3";
                calculation += Integer.toString(number[3]);
                showOnScreen(calculation);
            }

        });

        four.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "4";
                calculation += Integer.toString(number[4]);
                showOnScreen(calculation);
            }

        });

        five.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "5";
                calculation += Integer.toString(number[5]);
                showOnScreen(calculation);
            }

        });

        six.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "6";
                calculation += Integer.toString(number[6]);
                showOnScreen(calculation);
            }

        });

        seven.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "7";
                calculation += Integer.toString(number[7]);
                showOnScreen(calculation);
            }

        });

        eight.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "8";
                calculation += Integer.toString(number[8]);
                showOnScreen(calculation);
            }

        });

        nine.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                num = "9";
                calculation += Integer.toString(number[9]);
                showOnScreen(calculation);
            }

        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "+" && num != "-" && num != "x" && num != "/" && num != "%") {
                    num = "+";
                    operator = "+";
                    total += Integer.parseInt(calculation);
                    deleteCalculation();
                    showOnScreen(Integer.toString(total));
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "+" && num != "-" && num != "x" && num != "/" && num != "%") {
                    num = "-";
                    operator = "-";
                    total -= Integer.parseInt(calculation);
                    deleteCalculation();
                    showOnScreen(Integer.toString(total));
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "+" && num != "-" && num != "x" && num != "/" && num != "%") {
                    num = "x";
                    operator = "x";
                    total *= Integer.parseInt(calculation);
                    deleteCalculation();
                    showOnScreen(Integer.toString(total));
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "+" && num != "-" && num != "x" && num != "/" && num != "%") {
                    num = "/";
                    operator = "/";
                    total = total / Integer.parseInt(calculation);
                    if(Integer.parseInt(calculation) == 0) {
                        deleteCalculation();
                        showOnScreen("UNDEFINED");
                        total = 0;
                    }
                    else {
                        deleteCalculation();
                        showOnScreen(Integer.toString(total));
                    }
                }
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "+" && num != "-" && num != "x" && num != "/" && num != "%") {
                    num = "%";
                    operator = "%";
                    total = total % Integer.parseInt(calculation);
                    deleteCalculation();
                    showOnScreen(Integer.toString(total));
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteCalculation();
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == "+") {
                    total += Integer.parseInt(calculation);
                    deleteCalculation();
                    calculation = "";
                    showOnScreen(Integer.toString(total));
                    total = 0;
                    operator = "";
                } else if (operator == "-") {
                    total -= Integer.parseInt(calculation);
                    deleteCalculation();
                    calculation = "";
                    showOnScreen(Integer.toString(total));
                    total = 0;
                    operator = "";
                } else if (operator == "*") {
                    total *= Integer.parseInt(calculation);
                    deleteCalculation();
                    calculation = "";
                    showOnScreen(Integer.toString(total));
                    total = 0;
                    operator = "";
                } else if (operator == "/") {
                    total = total / Integer.parseInt(calculation);
                    deleteCalculation();
                    calculation = "";
                    showOnScreen(Integer.toString(total));
                    total = 0;
                    operator = "";
                } else if (operator == "%"){
                    total = total % Integer.parseInt(calculation);
                    deleteCalculation();
                    calculation = "";
                    showOnScreen(Integer.toString(total));
                    total = 0;
                    operator = "";
                }
                else {
                    if(calculation == "")
                    {
                        calculation = "0";
                    }
                    total = Integer.parseInt(calculation);
                    deleteCalculation();
                    showOnScreen(Integer.toString(total));
                }
            }
         });
        }

    public void showOnScreen(String calculation) {
        textCalc.setText(calculation);
    }

    public void deleteCalculation () {
        textCalc.setText("");
        calculation = "";
    }
}