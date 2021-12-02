package com.example.explicitintent;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et);
    findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String m = et1.getText().toString();
            Intent se = new Intent(MainActivity.this,MainActivity2.class);
            se.putExtra("CHARAN N S",m);
            startActivity(se);
        }
    });
    }
}