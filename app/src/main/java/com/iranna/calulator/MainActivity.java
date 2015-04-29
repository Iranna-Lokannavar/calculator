package com.iranna.calulator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    Button one, two, three, four, five, six, seven, eight, nine, zero, div, mul, sub, add,bs, clr, dot, equal;
    TextView tv1, tv2, tv3, tv4;

    double op1;
    double op2;


    String opt;

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
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        sub = (Button) findViewById(R.id.sub);
        add = (Button) findViewById(R.id.add);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        bs = (Button) findViewById(R.id.bs);
        clr = (Button) findViewById(R.id.clr);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "1");
                } else {
                    tv3.setText(tv3.getText().toString().trim() + "1");
                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "2");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "2");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "3");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "3");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "4");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "4");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "5");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "5");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "6");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "6");
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "7");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "7");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "8");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "8");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "9");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "9");
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() + "0");

                } else {
                    tv3.setText(tv3.getText().toString().trim() + "0");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv2.getText() == "") {
                    tv1.setText(tv1.getText().toString().trim() +".");

                } else {
                    tv3.setText(tv3.getText().toString().trim() +".");
                }
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = tv4.getText().toString();
                s = s.substring(0,s.length()-1);
                tv4.setText(s);
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opt = "+";
                tv2.setText(opt);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opt = "-";
                tv2.setText(opt);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opt = "*";
                tv2.setText(opt);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opt = "/";
                tv2.setText(opt);
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Double.parseDouble(tv1.getText().toString());
                op2 = Double.parseDouble(tv3.getText().toString());

                //tv4.setText(""+(op1*op2));

                switch (opt){

                    case "+":

                        tv4.setText(""+(op1+op2));
                        break;
                    case "-":

                        tv4.setText(""+(op1-op2));
                        break;
                    case  "*":

                        tv4.setText(""+(op1*op2));
                        break;
                    case "/":

                        tv4.setText(""+(op1/op2));
                        break;
                    default:

                }
            }


               });


    }

}
