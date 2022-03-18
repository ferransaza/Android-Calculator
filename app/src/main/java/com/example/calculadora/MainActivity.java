package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    float num1, num2, op;
    float resultado, quitar_op, deg_or_rad, segunda_op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (float) 0.5;
        num2 = (float) 0.5;
        op = 0;
        quitar_op = 0;
        resultado = (float) 0.5;
        deg_or_rad = 1;
        segunda_op = 0;

        TextView texto = (TextView) findViewById(R.id.texto);

        Button btn_0 = (Button) findViewById(R.id.button0);
        Button btn_1 = (Button) findViewById(R.id.button1);
        Button btn_2 = (Button) findViewById(R.id.button2);
        Button btn_3 = (Button) findViewById(R.id.button3);
        Button btn_4 = (Button) findViewById(R.id.button4);
        Button btn_5 = (Button) findViewById(R.id.button5);
        Button btn_6 = (Button) findViewById(R.id.button6);
        Button btn_7 = (Button) findViewById(R.id.button7);
        Button btn_8 = (Button) findViewById(R.id.button8);
        Button btn_9 = (Button) findViewById(R.id.button9);
        Button btn_mult = (Button) findViewById(R.id.buttonmultiplicacion);
        Button btn_div = (Button) findViewById(R.id.buttondivision);
        Button btn_igual = (Button) findViewById(R.id.buttonigual);
        Button btn_cos = (Button) findViewById(R.id.buttoncos);
        Button btn_sin = (Button) findViewById(R.id.buttonsin);
        Button btn_tan = (Button) findViewById(R.id.buttontan);
        Button btn_sum = (Button) findViewById(R.id.buttonsuma);
        Button btn_rest = (Button) findViewById(R.id.buttonresta);
        Button btn_AC = (Button) findViewById(R.id.buttonAC);
        Button btn_DEG = (Button) findViewById(R.id.buttonDEG);
        Button btn_RAD = (Button) findViewById(R.id.buttonRAD);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("0");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "0");
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("1");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "1");
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("2");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "2");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("3");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "3");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("4");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "4");
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("5");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "5");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("6");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "6");
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("7");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "7");
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("8");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "8");
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quitar_op == 1) {
                    texto.setText("9");
                    quitar_op = 0;
                } else {
                    texto.setText(texto.getText().toString() + "9");
                }
            }
        });

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText("");
                num1 = (float) 0.5;
                num1 = (float) 0.5;
                op = 0;
                resultado = (float) 0.5;
                quitar_op = 0;
                deg_or_rad = 1;
                segunda_op = 0;
                btn_RAD.setVisibility(View.INVISIBLE);
                btn_DEG.setVisibility(View.INVISIBLE);
            }
        });

        btn_DEG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deg_or_rad = 0;
                texto.setText(Double.toString(Math.toDegrees(Double.parseDouble(Float.toString(resultado)))) + "grados");
            }
        });

        btn_RAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deg_or_rad = 1;
                texto.setText(Double.toString(Math.toRadians(Double.parseDouble(Float.toString(resultado)))) + "rad");
            }
        });

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (segunda_op == 0) {
                    num1 = new Float(texto.getText().toString());
                }
                else {
                    num2 = new Float(texto.getText().toString());
                    num1 = new Float(Obtener_resultado());
                }
                texto.setText("+");
                op = 1;
                quitar_op = 1;
                segunda_op = 1;
            }
        });

        btn_rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (segunda_op == 0) {
                    num1 = new Float(texto.getText().toString());
                }
                else {
                    num2 = new Float(texto.getText().toString());
                    num1 = new Float(Obtener_resultado());
                }
                texto.setText("-");
                op = 2;
                quitar_op = 1;
                segunda_op = 1;
            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (segunda_op == 0) {
                    num1 = new Float(texto.getText().toString());
                }
                else {
                    num2 = new Float(texto.getText().toString());
                    num1 = new Float(Obtener_resultado());
                }
                texto.setText("×");
                op = 3;
                quitar_op = 1;
                segunda_op = 1;
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (segunda_op == 0) {
                    num1 = new Float(texto.getText().toString());
                }
                else {
                    num2 = new Float(texto.getText().toString());
                    num1 = new Float(Obtener_resultado());
                }
                texto.setText("/");
                op = 4;
                quitar_op = 1;
                segunda_op = 1;
            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText("sin");
                op = 5;
                quitar_op = 1;
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText("cos");
                op = 6;
                quitar_op = 1;
            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText("tan");
                op = 7;
                quitar_op = 1;
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = new Float(texto.getText().toString());
                if (op != 0) {
                    texto.setText(Obtener_resultado());
                } else {
                    texto.setText("Seleccione antes una operación.");
                }
                btn_RAD.setVisibility(View.VISIBLE);
                btn_DEG.setVisibility(View.VISIBLE);
                num1 = (float) 0.5;
                num2 = (float) 0.5;
                op = 0;
                quitar_op = 0;
            }
        });
    }

    public String Obtener_resultado() {
        if (op == 1) {
            resultado = num1 + num2;
            return Float.toString(resultado);
        }
        if (op == 2) {
            resultado = num1 - num2;
            return Float.toString(resultado);
        }
        if (op == 3) {
            resultado = num1 * num2;
            return Float.toString(resultado);
        }
        if (op == 4) {
            resultado = num1 / num2;
            return Float.toString(resultado);
        }
        if (op == 5) {
            resultado = (float) Math.sin(num2);
            String res = Float.toString(resultado) + " rad";
            return res;
        }
        if (op == 6) {
            resultado = (float) Math.cos(num2);
            String res = Float.toString(resultado) + " rad";
            return res;
        }
        if (op == 7) {
            resultado = (float) Math.tan(num2);
            String res = Float.toString(resultado) + " rad";
            return res;
        }
        return "0";
        }
    }