package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int Index;
    private VraisFaux Question;
    private int NbReponse;
    private VraisFaux[] questions = new VraisFaux[]{
            new VraisFaux("1 + 1 = ?","2","11",true,false),
            new VraisFaux("1 * 1 = ?","1","10",true,false),
            new VraisFaux("10/10 = ?","1","10",true,false),
            new VraisFaux("10*100","110","3e8",false,true),
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");

        // Récupère l'index du tableau dans lequel on est
        Index = intent.getIntExtra("index",0);

        // Prend le résultat boolean et la bonne réponse et incrémente la réponse correcte
        NbReponse = intent.getIntExtra("nombreRep",0);
        Boolean Reponse = intent.getBooleanExtra("param",false);
        if(Reponse){
            NbReponse = NbReponse +1 ;
        }

        // Lance la second Activity pour afficher le résultat
        if(Index==questions.length){
            Intent intentResult = new Intent(MainActivity.this,Activity_page2.class);
            intentResult.putExtra("nombreRep",NbReponse);
            intentResult.putExtra("nombreQuestion",Index);
            startActivity(intentResult);
            finish();
            return;
        }




        // Récupère la question selon l'index
        Question = questions[Index];

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(Question.getQuestion());


        // Bouton n°1 cliqué
        Button button1Page1 = (Button)findViewById(R.id.button1);
        button1Page1.setText(Question.getQuestion1());
        button1Page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                intent.putExtra("param",Question.isReponse1());
                intent.putExtra("index",Index+1);
                intent.putExtra("nombreRep",NbReponse);
                startActivity(intent);
                // Ferme l'activity précèdente
                finish();
            }
        });




        // Bouton n°2 cliqué
        Button button2page1 = (Button)findViewById(R.id.button2);
        button2page1.setText(Question.getQuestion2());
        button2page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                intent.putExtra("param",Question.isReponse2());
                intent.putExtra("index",Index+1);
                intent.putExtra("nombreRep",NbReponse);
                startActivity(intent);
                // Ferme l'activity précèdente
                finish();
            }
        });
    }

}