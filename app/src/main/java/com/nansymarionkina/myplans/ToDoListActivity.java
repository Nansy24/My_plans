package com.nansymarionkina.myplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        RecyclerView rcViewToDoList = findViewById(R.id.rc_view_to_do_list);

        ToDoList[] myList = {new ToDoList("Graduate from University with red diploma"),
        new ToDoList("Improve my English from B2 to C2"),
        new ToDoList("Learn Spanish at least B1"),
        new ToDoList("Start working for myself in android-developing"),
        new ToDoList("Maybe start my master degree in information technology")};

        ToDoListAdapter myAdapter = new ToDoListAdapter(myList);
        rcViewToDoList.setAdapter(myAdapter);
    }


}