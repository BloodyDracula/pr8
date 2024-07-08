package com.example.pr8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:88005553535"));
            startActivity(intent1);
        }
        else if (v.getId() == R.id.btn2) {
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.24084227477677, -115.81447928044979"));
            startActivity(intent2);
        }
        else if (v.getId() == R.id.btn3) {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://animego.org/"));
            startActivity(intent3);
        }
    }
}