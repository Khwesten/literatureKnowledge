package com.example.andoird.agenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by NoteSamsung on 20/03/2016.
 */
public class Congrats extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congrast_main);
    }

    public void restart(View view) {
        Intent viewList = new Intent(this, MainActivity.class);

        if (viewList.resolveActivity(getPackageManager()) != null) {
            startActivity(viewList);
        }
    }
}
