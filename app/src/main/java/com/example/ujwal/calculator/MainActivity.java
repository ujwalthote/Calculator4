package com.example.ujwal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2;
    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, equal, add, sub, mul, div, clear;
    double result=0;
    float temp;
    int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);

        equal = (Button) findViewById(R.id.equal);
        clear = (Button) findViewById(R.id.clr);
        t1 = (TextView) findViewById(R.id.textview1);

        t2 = (TextView) findViewById(R.id.textView2);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.append("1");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("2");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("3");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("4");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("5");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("6");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("7");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("8");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("9");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append("0");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.append(".");
                temp = Float.parseFloat(t1.getText().toString());

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //t1.append("+");
                switch (status) {
                    case 1:
                        result = result + temp;
                        break;
                    case 2:
                        result = result - temp;
                        break;
                    case 3:
                        result = result * temp;
                        break;
                    case 4:
                        if (temp != 0) {
                            result = (double) result / (double) temp;
                            t2.setText(String.valueOf(result));
                        } else {
                            Toast.makeText(getApplicationContext(), "Divide by zero", Toast.LENGTH_LONG).show();
                        }
                        break;
                    default:
                }
                t1.setText("");
                status = 1;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //t1.append("+");
                switch (status) {
                    case 1:
                        result = result + temp;
                        break;
                    case 2:
                        result = result - temp;
                        break;
                    case 3:
                        result = result * temp;
                        break;
                    case 4:
                        if (temp != 0) {
                            result = (double) result / (double) temp;
                            t2.setText(String.valueOf(result));
                        } else {
                            Toast.makeText(getApplicationContext(), "Divide by zero", Toast.LENGTH_LONG).show();
                        }
                        break;
                    default:
                }
                t1.setText("");
                status = 2;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                result = 0.0f;
                temp = 0.0f;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //t1.append("+");
                switch (status) {
                    case 1:
                        result = result + temp;
                        break;
                    case 2:
                        result = result - temp;
                        break;
                    case 3:
                        result = result * temp;
                        break;
                    case 4:
                        if (temp != 0) {
                            result = (double) result / (double) temp;
                            t2.setText(String.valueOf(result));
                        } else {
                            Toast.makeText(getApplicationContext(), "Divide by zero", Toast.LENGTH_LONG).show();
                        }
                        break;
                    default:
                }
                t1.setText("");
                status = 3;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //t1.append("+");
                switch (status) {
                    case 1:
                        result = result + temp;
                        break;
                    case 2:
                        result = result - temp;
                        break;
                    case 3:
                        result = result * temp;
                        break;
                    case 4:
                        if (temp != 0) {
                        result = (double) result / (double) temp;
                        t2.setText(String.valueOf(result));
                    } else {
                        Toast.makeText(getApplicationContext(), "Divide by zero", Toast.LENGTH_LONG).show();
                    }
                        break;
                    default:
                }
                t1.setText("");

                status = 4;
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (status) {
                    case 1:
                        result = result + temp;
                        t2.setText(String.valueOf(result));
                        break;
                    case 2:
                        result = result - temp;
                        t2.setText(String.valueOf(result));
                        break;
                    case 3:
                        result = result * temp;
                        t2.setText(String.valueOf(result));
                        break;
                    case 4:
                        if (temp != 0) {
                            result = (double) result / (double) temp;
                            t2.setText(String.valueOf(result));
                        } else {
                            Toast.makeText(getApplicationContext(), "Divide by zero", Toast.LENGTH_LONG).show();
                        }
                        break;


                }
            }
        });


    }
}
