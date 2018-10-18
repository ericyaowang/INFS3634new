package com.example.yaowang.infs3634;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {


    Button btn_learn;
    Button btn_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        btn_learn = findViewById(R.id.learn_button);
        btn_quiz = findViewById(R.id.test_button);



        btn_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Start.this,LessonOne.class);

                startActivity(i);
            }
        });
    }
}
