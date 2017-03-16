package lubimybzykac.pl.monika_lubimybzykac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by szzc on 08.03.17.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }

}
