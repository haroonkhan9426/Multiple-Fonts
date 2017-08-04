package com.csdelta.haroon.multiplefonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;

    Typeface asim;
    Typeface athletic;
    Typeface droidSans;
    Typeface greenAvocado;
    Typeface avocadoThin;
    Typeface iDroidBold;
    Typeface iDroid;
    Typeface smartWatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);

        asim = Typeface.createFromAsset(getAssets(),"fonts/Asimovation.ttf");
        athletic = Typeface.createFromAsset(getAssets(),"fonts/Athletic.ttf");
        droidSans = Typeface.createFromAsset(getAssets(),"fonts/DroidSans.ttf");
        greenAvocado = Typeface.createFromAsset(getAssets(),"fonts/Green Avocado.ttf");
        avocadoThin = Typeface.createFromAsset(getAssets(),"fonts/Green Avocado-thin.ttf");
        iDroidBold = Typeface.createFromAsset(getAssets(),"fonts/IDroid Bold Italic.otf");
        iDroid = Typeface.createFromAsset(getAssets(),"fonts/IDroid.otf");
        smartWatch = Typeface.createFromAsset(getAssets(),"fonts/smart watch.ttf");
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button1) {
            text.setTypeface(asim);
        } else if (id == R.id.button2) {
            text.setTypeface(athletic);
        } else if (id == R.id.button3) {
            text.setTypeface(droidSans);
        } else if (id == R.id.button4) {
            text.setTypeface(greenAvocado);
        } else if (id == R.id.button5) {
            text.setTypeface(avocadoThin);
        } else if (id == R.id.button6) {
            text.setTypeface(iDroid);
        } else if (id == R.id.button7) {
            text.setTypeface(iDroid);
        } else if (id == R.id.button8) {
            text.setTypeface(smartWatch);
        }
    }
}
