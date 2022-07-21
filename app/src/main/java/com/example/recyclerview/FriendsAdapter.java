package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendViewHolder> {
    Context context;
    ArrayList<Friends> friends;

    public FriendsAdapter(Context context, ArrayList<Friends> friends) {
        this.context = context;
        this.friends = friends;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_row,parent,false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
    Friends friend = friends.get(position);
    holder.friendimage.setImageResource(friend.getImage());
    holder.titles.setText(friend.getTitle());
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    public class FriendViewHolder extends RecyclerView.ViewHolder {
        ImageView friendimage;
        TextView titles;
        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
            friendimage = itemView.findViewById(R.id.Friendimage);
            titles = itemView.findViewById(R.id.titles);
        }
    }
}
