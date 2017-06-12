package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.textView2);
        editText.setText(texte);
    }
}
