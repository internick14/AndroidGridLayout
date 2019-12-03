package com.example.jose.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.example.jose.androidgridlayout.Interface.ItemClickListener;

public class MainActivity extends AppCompatActivity {

    CardView card_me, card_family, card_lovely, card_team, card_friends, card_calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_me = findViewById(R.id.card_me);
        card_family = findViewById(R.id.card_family);
        card_lovely = findViewById(R.id.card_lovely);
        card_team = findViewById(R.id.card_team);
        card_friends = findViewById(R.id.card_friends);
        card_calendar = findViewById(R.id.card_calendar);


        card_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Me", Toast.LENGTH_SHORT).show();
                Intent me_intent = new Intent(MainActivity.this, MeActivity.class);
                startActivity(me_intent);
            }
        });

        card_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Family", Toast.LENGTH_SHORT).show();
            }
        });

        card_lovely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Lovely", Toast.LENGTH_SHORT).show();
            }
        });

        card_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Team", Toast.LENGTH_SHORT).show();
            }
        });

        card_friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Friends", Toast.LENGTH_SHORT).show();
            }
        });

        card_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calendar", Toast.LENGTH_SHORT).show();
            }
        });







    }
}
