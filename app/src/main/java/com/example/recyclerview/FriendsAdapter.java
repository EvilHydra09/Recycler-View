package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsAdapter {
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
