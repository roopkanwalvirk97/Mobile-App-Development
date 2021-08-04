package com.example.sqliteapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    // Reference Variables for the Views
    EditText name, contact, dob;
    Button insert, update, delete,view;
    DBHelper DB;

    void initViews(){
        name = findViewById(R.id.name);
        contact = findViewById(R.id.contact);
        dob = findViewById(R.id.dob);
        insert = findViewById(R.id.btnInsert);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);


        Intent rcv = getIntent();
        String name1 = rcv.getStringExtra("keyName");
        String contact1 = rcv.getStringExtra("keyPhone");
        String dob1 = rcv.getStringExtra("Keydob");

        name.setText(name1);
        contact.setText(contact1);
        dob.setText(dob1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initViews();
    }

    @Override
    public void onClick(View v) {
        finish(); // destroy the Activity
    }
}