package com.example.andreii.mysuperarchitecture.presentation.screen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.andreii.mysuperarchitecture.R;
import com.example.andreii.mysuperarchitecture.presentation.screen.HW9.user.UserProfileActivity;

public class MainActivityJava extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        Log.d("SuperArchitect", "Load Main Activity java");
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityJava.this, UserProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
