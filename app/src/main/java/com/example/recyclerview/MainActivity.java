package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button grid , linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        recyclerView = findViewById(R.id.recyclerview);
        grid = findViewById(R.id.grid);
        linear = findViewById(R.id.linear);
        ArrayList<Friends> friends = new ArrayList<>();
        friends.add(new Friends("Aditya",R.drawable.aditya));
        friends.add(new Friends("Jyotiram",R.drawable.jyotiram));
        friends.add(new Friends("Atharva",R.drawable.atharva));
        friends.add(new Friends("Maharaj",R.drawable.maharaj));
        FriendsAdapter ad = new FriendsAdapter(getApplicationContext(),friends);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setLayoutManager(gridLayoutManager);
            }
        });
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
        });

        recyclerView.setAdapter(ad);



    }
}