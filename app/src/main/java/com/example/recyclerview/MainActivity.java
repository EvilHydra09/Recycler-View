package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<Friends> friends = new ArrayList<>();
        friends.add(new Friends("Aditya",R.drawable.aditya));
        friends.add(new Friends("Jyotiram",R.drawable.jyotiram));
        friends.add(new Friends("Atharva",R.drawable.atharva));
        friends.add(new Friends("Maharaj",R.drawable.maharaj));
        FriendsAdapter friendsAdapter = new FriendsAdapter(this,friends);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(friendsAdapter);



    }
}