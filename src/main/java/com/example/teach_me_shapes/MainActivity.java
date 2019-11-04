package com.example.teach_me_shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void activity1(View view) {
        Intent intent=new Intent(MainActivity.this,
                Activity_1.class);
        startActivity(intent);

    }

    public void activity2(View view) {
        Intent intent=new Intent(MainActivity.this,Activity_2.class);
        startActivity(intent);
    }
}
