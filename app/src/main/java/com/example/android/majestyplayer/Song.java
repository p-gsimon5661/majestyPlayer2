/**
 * Implement from the Miwok Word class
 */
package com.example.android.majestyplayer;

public class Song {
    private String mSongName;
    private int mSongAuthor;
    private int mAlbumArtId;

    public Song(String songName, int songAuthor, int ablumArtId) {
        mSongName = songName;
        mSongAuthor = songAuthor;
        mAlbumArtId = ablumArtId;
    }

    public String getmSongName() {
        return mSongName;
    }

    public int getmSongAuthor() {
        return mSongAuthor;
    }

    public int getmAlbumArtId() {
        return mAlbumArtId;
    }
}
