/**
 * Implement from the Miwok example
 */
package com.example.android.majestyplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the the button for the rise and shine album
        Button riseAndShine = findViewById(R.id.riseAndShineBtn);

        // Set a click listener on that View
        riseAndShine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent riseAndShineIntent = new Intent(MainActivity.this, RiseAndShineActivity.class);
                startActivity(riseAndShineIntent);
            }
        });

        // Find the the button for the sunday school singalong album
        Button sundaySchoolSingalong = findViewById(R.id.sundaySchoolSingalongBtn);

        // Set a click listener on that View
        sundaySchoolSingalong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sundaySchoolSingalongIntent = new Intent(MainActivity.this, SundaySchoolSingalongActivity.class);
                startActivity(sundaySchoolSingalongIntent);
            }
        });

        // Find the the button for the coldheartica album
        final Button coldheartica = findViewById(R.id.coldhearticaBtn);

        // Set a click listener on that View
        coldheartica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coldhearticaIntent = new Intent(MainActivity.this, ColdhearticaActivity.class);
                startActivity(coldhearticaIntent);
            }
        });
    }
}
