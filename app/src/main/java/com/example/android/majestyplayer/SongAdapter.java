/**
 * implmented from the Miwok word Adapter
 */
package com.example.android.majestyplayer;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.majestyplayer.Song;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    private int mColorResourceId;

    public SongAdapter(Activity context, ArrayList<Song> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getmSongName());

        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        authorTextView.setText(currentSong.getmSongAuthor());

        ImageView imageView = listItemView.findViewById(R.id.songArt);
        imageView.setImageResource(currentSong.getmAlbumArtId());

        View textContianer = listItemView.findViewById(R.id.text_contianer);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContianer.setBackgroundColor(color);

        return listItemView;
    }
}
