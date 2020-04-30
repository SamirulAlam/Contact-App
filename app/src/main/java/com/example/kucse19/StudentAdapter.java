package com.example.kucse19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter <StudentAdapter.ViewHolder> {

    private ArrayList<Student> students;
    ItemClicked activity;
    public interface ItemClicked{
        void onItemClicked(int index);
    }
    public StudentAdapter(Context context,ArrayList<Student> list){
        students=list;
        activity=(ItemClicked)context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivpic;
        TextView tvname,tvid;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivpic=itemView.findViewById(R.id.ivpic);
            tvname=itemView.findViewById(R.id.tvname);
            tvid=itemView.findViewById(R.id.tvid);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(students.indexOf((Student)v.getTag()));
                }
            });
        }
    }
    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(students.get(position));

        holder.tvname.setText(students.get(position).getName());
        holder.tvid.setText(students.get(position).getId());

        

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
