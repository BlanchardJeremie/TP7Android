package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity_page2 extends AppCompatActivity {

    private VraisFaux[] questions = new VraisFaux[]{
            new VraisFaux("1 * 1 = ?","1","10",true),
            new VraisFaux("10/10 = ?","1","10",true),
            new VraisFaux("10*100","110","3e8",false), };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.textQuestion);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);


        int pos = 0;

        for(int i = 3; pos<i; pos++){
            editText.setText(questions[pos].getQuestion());
            button3.setText(questions[pos].getQuestion1());
            button4.setText(questions[pos].getQuestion2());
                    }








    }
}
