package com.example.android.farhanputrariantono_1202150098_studycase5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddToDoActivity extends AppCompatActivity {
    //deklarasi variable
    EditText ToDo, Description, Priority;
    Database dtbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        setTitle("Add To Do");


        ToDo = (EditText) findViewById(R.id.editTodo);
        Description = (EditText) findViewById(R.id.editDesc);
        Priority = (EditText) findViewById(R.id.editPriority);
        dtbase = new Database(this);
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(AddToDoActivity.this, ListToDoActivity.class);

        startActivity(intent);

        this.finish();
    }

    public void tambah(View view) {
        if (dtbase.inputdata(new AddDataActivity(ToDo.getText().toString(), Description.getText().toString(), Priority.getText().toString()))){

            Toast.makeText(this, "To Do List has been added", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(AddToDoActivity.this, ListToDoActivity.class));

            this.finish();
        }else {
            //jika edit text kosong maka muncul toast berupa tidak bisa menambah ke dalam list
            Toast.makeText(this, "Cannot add the item to the list", Toast.LENGTH_SHORT).show();
            ToDo.setText(null);
            Description.setText(null);
            Priority.setText(null);
        }
    }
}
