package com.example.android.archimemedesprinciple;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.android.archimemedesprinciple.R;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        int val = (int)getIntent().getExtras().get("key");
        Log.i("TEST", "Val = "+val);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        String req_uriPATH;
        String uriPath1 = "android.resource://com.example.android.archimemedesprinciple/"+R.raw.archimedes;
        String uriPath2 = "android.resource://com.example.android.archimemedesprinciple/"+R.raw.archi2;

        if(val == 1){
            req_uriPATH = uriPath1;
        }
        else {
            req_uriPATH = uriPath2;
        }
        Uri video = Uri.parse(req_uriPATH);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
