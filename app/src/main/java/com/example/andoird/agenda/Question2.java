package com.example.andoird.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by NoteSamsung on 20/03/2016.
 */
public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2_main);
    }

    public void onRadioButtonClicked(View view) throws InterruptedException {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_3:
                if (checked)
                    Toast.makeText(
                            getApplicationContext(),
                            "Parabéns resposta CERTA!!!",
                            Toast.LENGTH_LONG
                    ).show();
                    break;
            default:
                Toast.makeText(
                        getApplicationContext(),
                        "Que pena, você ERROU!!!",
                        Toast.LENGTH_LONG
                ).show();
                break;
        }

        Thread.sleep(2000);

        Intent viewList = new Intent(this, Question3.class);

        if (viewList.resolveActivity(getPackageManager()) != null) {
            startActivity(viewList);
        }
    }
}
