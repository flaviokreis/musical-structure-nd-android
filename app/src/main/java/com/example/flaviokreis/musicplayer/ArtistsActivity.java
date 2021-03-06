package com.example.flaviokreis.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistsActivity extends AppCompatActivity {

    @BindView(R.id.now_playing_button)
    TextView nowPlayingButton;

    @BindView(R.id.artist)
    LinearLayout artist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        ButterKnife.bind(this);

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNowPlaying();
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSongs();
            }
        });
    }

    private void goToNowPlaying(){
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }

    private void goToSongs(){
        Intent intent = new Intent(this, SongsActivity.class);
        startActivity(intent);
    }
}
