package d2.hu.service1example;

import android.app.Service;
import android.content.Intent;

import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {

    MediaPlayer myPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        Toast.makeText(this,"Service Created",Toast.LENGTH_LONG).show();

//        myPlayer = MediaPlayer.create(this,R.raw.sun);
        myPlayer.setLooping(false); //set looping

    }

    @Override
    public void onStart(Intent intent,int startid){
        Toast.makeText(this,"Service Started", Toast.LENGTH_LONG).show();
        myPlayer.start();
    }

    @Override
    public void onDestroy(){
        Toast.makeText(this,"Service Stopped", Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }
}
