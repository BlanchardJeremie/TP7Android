package com.example.admin.tp7android;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Activity_page2 extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        int Result =  intent.getIntExtra("nombreRep",0);
        int NbQuestion = intent.getIntExtra("nombreQuestion",0);


        TextView text = (TextView) findViewById(R.id.textresultat);
        text.setText(String.valueOf(Result)+"\\"+String.valueOf(NbQuestion));

        Log.d("Activity2",String.valueOf(Result));
    }
}
