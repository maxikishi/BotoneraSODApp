package com.example.maxi.botonerasodapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button b1, b2, b3;
    Button b4, b5, b6;
    Button b7, b8, b9;
    Button b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.recheto);

        b1 = (Button)findViewById(R.id.button1);
        //b1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        mp.start();
        //    }
        //});
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b10 = (Button)findViewById(R.id.button9);

    }

    @Override
    protected void onStop() {
        super.onStop();
        mp.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.pause();
    }

    public void onClickButon1(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.recheto); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon2(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.hola_lucas); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon3(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.tomas); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon4(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.yarara); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon5(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.tigre); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon6(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.perrito_lucas); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon7(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.nervio); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon8(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.mimito); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon9(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.nervioso); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }

    public void onClickButon10(View view){
        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this,R.raw.mantra); //create a new  media player with the selected id
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //mp.prepare(); //salta exception
        mp.seekTo(0);                             //seek to starting of song means time=0 ms
        mp.start();
    }
}
