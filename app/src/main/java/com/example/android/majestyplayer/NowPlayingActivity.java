package com.example.android.majestyplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String songName = extras.getString("songName");
            int songArt = extras.getInt("songArt");

            TextView songNameTextView = findViewById(R.id.current_song);
            songNameTextView.setText(songName);

            ImageView songArtImageView = findViewById(R.id.current_art);
            songArtImageView.setImageResource(songArt);
        }
    }
}
