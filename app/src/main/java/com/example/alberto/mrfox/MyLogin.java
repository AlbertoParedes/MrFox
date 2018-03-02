package com.example.alberto.mrfox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyLogin extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);
        getSupportActionBar().hide();

        login = findViewById(R.id.btNext);

    }

    public void loginButton(View view) {

        Intent i = new Intent(this,MyMain.class);
        startActivity(i);

    }
}
