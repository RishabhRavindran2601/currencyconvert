package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText rupeeAmount = (EditText) findViewById(R.id.rupeeAmount);
        Double rupeeAmountNum = Double.parseDouble(rupeeAmount.getText().toString());
        Double dollarAmount = rupeeAmountNum*0.0137;
        Double euroAmount = rupeeAmountNum*0.0114;
        ImageView image1 = (ImageView) findViewById(R.id.mainImage);
        image1.setImageResource(R.drawable.rupee);
        ImageView image = (ImageView) findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.dollar);
        TextView txtView = (TextView) findViewById(R.id.txt);
        txtView.setText("" + dollarAmount);
        TextView txtTxtView = (TextView) findViewById(R.id.txtTxt);
        txtTxtView.setText("" + euroAmount);
        Log.i("amount",rupeeAmount.getText().toString());

    }
    public void revConvert(View view){
        EditText dollarAmount = (EditText) findViewById(R.id.rupeeAmount);
        Double dollarAmountNum = Double.parseDouble(dollarAmount.getText().toString());
        Double rupeeAmount = dollarAmountNum*73.02;
        Double euroAmount = dollarAmountNum*0.84;
        ImageView image1 = (ImageView) findViewById(R.id.mainImage);
        image1.setImageResource(R.drawable.dollar);
        ImageView image = (ImageView) findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.rupee);
        TextView txtView = (TextView) findViewById(R.id.txt);
        txtView.setText("" + rupeeAmount);
        TextView txtTxtView = (TextView) findViewById(R.id.txtTxt);
        txtTxtView.setText("" + euroAmount);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image1 = (ImageView) findViewById(R.id.mainImage);
        image1.setImageResource(android.R.color.transparent);
    }
}