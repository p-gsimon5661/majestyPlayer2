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

public class ColdhearticaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<>();
        final int author = R.string.author2;
        final int albumArt = R.drawable.coldheartica;

        songs.add(new Song("Sailing, Sailing", author, albumArt));
        songs.add(new Song("The Crew Sails Into Coldheartica (Dialog)", author, albumArt));
        songs.add(new Song("Whatever", author, albumArt));
        songs.add(new Song("Klondike Q Penguin (Dialog)", author, albumArt));
        songs.add(new Song("Just Let Me Serve You", author, albumArt));
        songs.add(new Song("Man Overboard! (Dialog)", author, albumArt));
        songs.add(new Song("Lean A, Lean A, Lean", author, albumArt));
        songs.add(new Song("Zero the Polar Bear Attacks! (Dialog)", author, albumArt));
        songs.add(new Song("Sardines and Saltines", author, albumArt));
        songs.add(new Song("Dr. Jack Frost Agrees to Help (Dialog)", author, albumArt));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.secondaryDarkColor);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);

                Intent nowPlayingIntent = new Intent(ColdhearticaActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtra("songName", song.getmSongName());
                nowPlayingIntent.putExtra("songArt", song.getmAlbumArtId());
                startActivity(nowPlayingIntent);
            }

            ;
        });
    }
}
