package com.example.jayde.androidwebviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText edittext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button1);
        edittext1 = (EditText)findViewById(R.id.editText);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newscreen();      //method to start
            }
        });

    }

    private void newscreen() {

        String url = edittext1.getText().toString();
        Intent intent = new Intent(this, Google.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
