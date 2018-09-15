/**
 * Implement from the Miwok example
 */
package com.example.android.majestyplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RiseAndShineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<>();
        final int author = R.string.author1;
        final int albumArt = R.drawable.riseandshine;

        songs.add(new Song("Rise and Shine", author, albumArt));
        songs.add(new Song("Lazy Bones", author, albumArt));
        songs.add(new Song("This Is the Day", author, albumArt));
        songs.add(new Song("Fire Up", author, albumArt));
        songs.add(new Song("Whatever", author, albumArt));
        songs.add(new Song("Grumblers", author, albumArt));
        songs.add(new Song("Keep Your Sunny Side Up", author, albumArt));
        songs.add(new Song("Look On the Sunny Side", author, albumArt));
        songs.add(new Song("Ho Ho Medley", author, albumArt));
        songs.add(new Song("Let Those Pearlies Shine", author, albumArt));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.secondaryColor);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);

                Intent nowPlayingIntent = new Intent(RiseAndShineActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtra("songName", song.getmSongName());
                nowPlayingIntent.putExtra("songArt", song.getmAlbumArtId());
                startActivity(nowPlayingIntent);
            }

            ;
        });
    }
}
