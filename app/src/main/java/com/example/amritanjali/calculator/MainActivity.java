package com.example.amritanjali.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,be,del,b10;

    EditText e;
    TextView t;
    float o ,T ;

    boolean A,S,D,M ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.b);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        be=(Button)findViewById(R.id.be);
        bp=(Button)findViewById(R.id.bp);
       del=(Button)findViewById(R.id.del);
        e=(EditText)findViewById(R.id.e);
        b10=(Button)findViewById(R.id.b10);
       t=(TextView)findViewById(R.id.t);







        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+".");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText("");

            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e == null){
                    e.setText("");
                }else {
                    o = Float.parseFloat(e.getText() + "");
                    A= true;
                    e.setText(null);
                }
            }
        });


        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T = Float.parseFloat(e.getText() + "");

                if (A == true){

                    e.setText(o + T+"");
                    A=false;
                }


                if (S == true){
                    e.setText(o - T+"");
                    S=false;
                }

                if (M == true){
                    e.setText(o * T+"");
                    M=false;
                }

                if (D== true){
                    e.setText(o/ T+"");
                    D=false;
                }
            }
        });




    }
}
