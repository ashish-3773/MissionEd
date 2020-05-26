package com.missionedappdev.missoned;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_chapter extends AppCompatActivity {
    private static final String TAG = "activity_chapter";
    private Button btnAct1;
    private Button btnAct2;
    private Button btnAct3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);


        btnAct1 = findViewById(R.id.notes);
        btnAct2 = findViewById(R.id.quizoes);
        btnAct3 = findViewById(R.id.test);

        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Step","notes opened");
                startActivity(new Intent(activity_chapter.this, activity_notes.class));
            }
        });

        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Step","quizoes opened");
                startActivity(new Intent(activity_chapter.this, activity_quizoes.class));
            }
        });
        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Step","test opened");
                startActivity(new Intent(activity_chapter.this, activity_test.class));
            }
        });

    }

}
