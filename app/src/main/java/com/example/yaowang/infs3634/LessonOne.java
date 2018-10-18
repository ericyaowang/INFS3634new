package com.example.yaowang.infs3634;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class LessonOne extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String VIDEO_ID = "cVGK_oO-n1A";

    public static final String api = "AIzaSyA2NQFUVDryktayw9hv2Kc2KQKGUIxpwms";

    YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);


        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.lesson_one);

        youTubePlayerView.initialize(api, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


        if (!b) {
            youTubePlayer.loadVideo(VIDEO_ID);

        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider(){
        return (YouTubePlayerView) findViewById(R.id.lesson_one);








    }
}

