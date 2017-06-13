package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Intent intent = getIntent();
        Boolean Reponse = intent.getBooleanExtra("param",false);

        TextView textView = (TextView) findViewById(R.id.textViewResultat);
        }

}
