package com.example.andoird.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add contact to list
     * @param view
     */
    public void init(View view) {
        Intent viewList = new Intent(this, Question1.class);

        if (viewList.resolveActivity(getPackageManager()) != null) {
            startActivity(viewList);
        }
    }
}
