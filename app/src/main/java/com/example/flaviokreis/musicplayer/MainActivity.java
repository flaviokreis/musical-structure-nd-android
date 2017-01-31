package com.example.flaviokreis.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.playlists_button)
    TextView playlistsButton;

    @BindView(R.id.artists_button)
    TextView artistsButton;

    @BindView(R.id.albums_button)
    TextView albumsButton;

    @BindView(R.id.now_playing_button)
    TextView nowPlayingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlaylists();
            }
        });

        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToArtists();
            }
        });

        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAlbums();
            }
        });

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNowPlaying();
            }
        });

    }

    private void goToPlaylists(){
        Intent intent = new Intent(this, PlaylistsActivity.class);
        startActivity(intent);
    }

    private void goToArtists(){
        Intent intent = new Intent(this, ArtistsActivity.class);
        startActivity(intent);
    }

    private void goToAlbums(){
        Intent intent = new Intent(this, AlbumsActivity.class);
        startActivity(intent);
    }

    private void goToNowPlaying(){
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }
}
