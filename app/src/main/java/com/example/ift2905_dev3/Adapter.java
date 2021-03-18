package com.example.ift2905_dev3;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    String data1[];
    String data2[];
    Context context;


    public Adapter(Context ct, String s1[], String[] s2)
    {
        context=ct;
        data1=s1;
        data2=s2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.searchcontainer, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.name.setText(data1[position]);
            holder.description.setText(data2[position]);
            holder.add.setImageResource(R.drawable.add);
            holder.message.setImageResource(R.drawable.message);
            holder.profile.setImageResource(R.drawable.avatar_foreground);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, description;
        ImageView profile, add, message;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            profile = itemView.findViewById(R.id.profile);
            add = itemView.findViewById(R.id.add);
            message= itemView.findViewById(R.id.message);

        }
    }
}
