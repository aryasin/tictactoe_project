package com.example.sindhiya.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button buttonpp;
    private Button buttonpc;
    private Button buttonex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        buttonpp = findViewById(R.id.buttonpp);
        buttonpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openplayervsplayer();
            }
        });
    }

    private void openplayervsplayer()
    {
        Intent intent=new Intent(this,playervsplayer.class);
        startActivity(intent);

    }
}
