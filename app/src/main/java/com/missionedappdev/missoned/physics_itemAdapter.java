package com.missionedappdev.missoned;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class physics_itemAdapter extends RecyclerView.Adapter<physics_itemAdapter.physcics_itemHolder> {
    private ArrayList<physics_item> mphysicslist;
    private Context context;

    public physics_itemAdapter(Context context,ArrayList<physics_item> mphysicslist)
    {
        this.context=context; this.mphysicslist=mphysicslist;
    }

    public static class physcics_itemHolder extends RecyclerView.ViewHolder{
        public ImageView mImageview;
        public TextView mTextView;

        public physcics_itemHolder(@NonNull View itemView) {
            super(itemView);
            mImageview = itemView.findViewById(R.id.imageView);
            mTextView = itemView.findViewById(R.id.textView);
        }
    }

    /*public physics_itemAdapter(ArrayList<physics_item> physicslist){
        mphysicslist = physicslist;
    }*/

    @NonNull
    @Override
    public physcics_itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.physics_item, parent, false);
        physcics_itemHolder evh = new physcics_itemHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull physcics_itemHolder holder, int position) {
        physics_item currentItem = mphysicslist.get(position);

        holder.mImageview.setImageResource(currentItem.getmImageResource());
        holder.mTextView.setText(currentItem.getMchapter());

        holder.mImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // new Activity1().openChapter();

            }
        });

        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // new Activity1().openChapter();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mphysicslist.size();
    }

}
