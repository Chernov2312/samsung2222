package com.example.lesson17032023;

import static com.example.lesson17032023.MainActivity.m;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;
import android.os.IBinder;

public class MyService extends Service {
    private MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        if(m==1){
            player = MediaPlayer.create(this, R.raw.music_menu);}
        else if(m==2){
            player = MediaPlayer.create(this, R.raw.inventory2);}
        else if(m==3){ player = MediaPlayer.create(this, R.raw.pech);}
        else if(m==4){ player = MediaPlayer.create(this, R.raw.feld);}
        player.setLooping(true);
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
