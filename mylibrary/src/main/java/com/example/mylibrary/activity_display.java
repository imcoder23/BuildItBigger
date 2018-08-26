package com.example.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.lib_jokes.MyClass;

public class activity_display extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_jokes);
//        MyClass joker = new MyClass();
//        String jokes = getIntent().getExtras().getString("Jokes");

//        Toast.makeText(this, jokes, Toast.LENGTH_SHORT).show();


        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,new FragmentJokeActivity()).commit();
        }

//        String gce_Jokes = getIntent().getStringExtra("Cloud");
//
//        Toast.makeText(this, gce_Jokes, Toast.LENGTH_SHORT).show();

    }
}
