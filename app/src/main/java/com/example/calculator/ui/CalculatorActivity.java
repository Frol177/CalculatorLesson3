package com.example.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.calculator.R;
import com.example.calculator.domain.CalculatorImpul;

import java.nio.charset.Charset;

public class CalculatorActivity extends AppCompatActivity implements CalculatorView {

    private CalculatorPresenter presenter;
    TextView resultText;
    public int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.CountValue);

        presenter = new CalculatorPresenter(this, new CalculatorImpul());

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "1";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "2";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "3";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "4";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "5";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "6";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "7";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "8";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });
        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "9";
                resultText.setText(arg);
                presenter.onButtonOneClicked();
            }

        });

        findViewById(R.id.btnsum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "+";
                resultText.setText(arg);

            }

        });
        findViewById(R.id.btnmul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "*";
                resultText.setText(arg);

            }

        });
        findViewById(R.id.btndiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "/";
                resultText.setText(arg);

            }

        });
        findViewById(R.id.btnsub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = arg + "-";
                resultText.setText(arg);

            }

        });
        findViewById(R.id.btndel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence arg = resultText.getText();
                arg = "";
                resultText.setText(arg);

            }

        });
        findViewById(R.id.bteq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr1 = (String) resultText.getText();
                String arr2;
                String arr3;
                StringBuilder stringBuilder1 = new StringBuilder();
                StringBuilder stringBuilder2 = new StringBuilder();
                char[] strToArray = arr1.toCharArray();
                char operation = '+';
                for (int i = 0; i < strToArray.length; i++) {
                    if (strToArray[i] == '+') {
                        operation = '+';
                        break;
                    }
                    if (strToArray[i] == '-') {
                        operation = '-';
                        break;
                    }
                    if (strToArray[i] == '*') {
                        operation = '*';
                        break;
                    }
                    if (strToArray[i] == '/') {
                        operation = '/';
                        break;
                    }
                }
                int a = 1;
                for (int i = 0; i < strToArray.length; i++) {
                    if (strToArray[i] != operation && a == 1) {
                        stringBuilder1.append(strToArray[i]);
                    } else {
                        if (a == 1) {
                            stringBuilder2.append(strToArray[i + 1]);
                            a++;
                            i++;
                        } else {
                            stringBuilder2.append(strToArray[i]);
                        }

                    }
                }
                arr2 = String.valueOf(stringBuilder1);
                arr3 = String.valueOf(stringBuilder2);

                float b = Float.parseFloat(arr2);
                float c = Float.parseFloat(arr3);
                if (operation == '+') {
                    float d = b + c;
                    resultText.setText(String.valueOf(d));
                }
                if (operation == '-') {
                    float d = b - c;
                    resultText.setText(String.valueOf(d));
                }
                if (operation == '*') {
                    float d = b * c;
                    resultText.setText(String.valueOf(d));
                }
                if (operation == '/') {
                    float d = b / c;
                    resultText.setText(String.valueOf(d));
                }

            }

        });

    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }

}