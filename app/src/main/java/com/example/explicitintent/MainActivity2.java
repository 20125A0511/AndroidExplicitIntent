package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv1);
        String m= getIntent().getStringExtra("CHARAN N S");
        tv.setText(m);
        Toast.makeText(getApplicationContext(),"App Made By KING CHARAN",Toast.LENGTH_LONG).show();
    }
}