package com.example.parsedata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.edit_textdata);
        Button button = findViewById(R.id.button_submitintent);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name", name.getText().toString());
                startActivity(i);
            }
        });
    }
}
