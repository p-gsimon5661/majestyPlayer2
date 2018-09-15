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

public class SundaySchoolSingalongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<>();
        final int author = R.string.author2;
        final int albumArt = R.drawable.sundayschoool;

        songs.add(new Song("The Sunday School Song", author, albumArt));
        songs.add(new Song("Let the Sunshine In", author, albumArt));
        songs.add(new Song("Jesus Loves Me (Round)", author, albumArt));
        songs.add(new Song("Arky, Arky", author, albumArt));
        songs.add(new Song("Rolled Away", author, albumArt));
        songs.add(new Song("Heavenly Sunshine", author, albumArt));
        songs.add(new Song("Wiggle Worm", author, albumArt));
        songs.add(new Song("My God Is So Big", author, albumArt));
        songs.add(new Song("Climb, Climb Up Sunshine Mountain", author, albumArt));
        songs.add(new Song("The B-I-B-L-E", author, albumArt));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.secondaryLightColor);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);

                Intent nowPlayingIntent = new Intent(SundaySchoolSingalongActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtra("songName", song.getmSongName());
                nowPlayingIntent.putExtra("songArt", song.getmAlbumArtId());
                startActivity(nowPlayingIntent);
            }

            ;
        });
    }
}
