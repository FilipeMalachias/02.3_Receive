package com.filipe.malachias.implicitintentreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. get the incoming Intent that was used to activate this MainActivity
        Intent implicitIntent = getIntent();

        // 2. Intent data is URI object.
        Uri uri = implicitIntent.getData();

        // 3. check to make sure that URI is no null
        if (uri != null)
        {
            // 4. display the uri data in our TextView
            String textToDisplay = uri.toString();
            TextView textView = findViewById(R.id.main_textview);

            textView.setText(textToDisplay);
        }
    }
}
