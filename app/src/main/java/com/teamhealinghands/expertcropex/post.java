package com.teamhealinghands.expertcropex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        LinearLayout home= findViewById(R.id.home);
        LinearLayout post = findViewById(R.id.post);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext = new Intent(post.this,MainActivity.class);
                startActivity(inext);
            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext = new Intent(post.this,post.class);
                startActivity(inext);
            }
        });
    }
}