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
    ArrayList<Friends> friend;

    public FriendsAdapter(Context context, ArrayList<Friends> friend) {
        this.context = context;
        this.friend = friend;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_row,parent,false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        Friends friends = friend.get(position);
        holder.friendimage.setImageResource(friends.getImage());
        holder.titles.setText(friends.getTitle());
    }

    @Override
    public int getItemCount() {
        return friend.size();
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
