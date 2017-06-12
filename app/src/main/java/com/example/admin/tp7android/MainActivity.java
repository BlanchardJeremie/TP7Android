package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton2 = (Button) findViewById(R.id.button2);
        bouton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Bouton 2");
                Intent intent = new Intent(MainActivity.this, Activity_page2.class);
                intent.putExtra("param","je viens du bouton n°2 !");
                startActivity(intent);
            }

            });

    }


    public void bouton1(View view) {
        Log.d("Bouton","bouton 1");
        Intent intent = new Intent(MainActivity.this,Activity_page3.class);
        intent.putExtra("param", "Je viens du bouton n°1 !");
        startActivity(intent);
    }
}