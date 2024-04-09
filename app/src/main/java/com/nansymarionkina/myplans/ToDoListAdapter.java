package com.nansymarionkina.myplans;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ToDoListAdapter extends RecyclerView.Adapter<ToDoListAdapter.ToDoListViewHolder> {

    private ToDoList[] myList;

    public ToDoListAdapter(ToDoList[] myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public ToDoListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_to_do_list, parent, false);
        return new ToDoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoListViewHolder holder, int position) {
        holder.bind(myList[position]);
    }

    @Override
    public int getItemCount() {
        return myList.length;
    }

    static class ToDoListViewHolder extends RecyclerView.ViewHolder{

        TextView task;
        public ToDoListViewHolder(@NonNull View itemView) {
            super(itemView);
            task = itemView.findViewById(R.id.item_to_do_list_text_view);
        }

        public void bind(ToDoList myItem) {
            task.setText(myItem.task);
        }
    }
}
