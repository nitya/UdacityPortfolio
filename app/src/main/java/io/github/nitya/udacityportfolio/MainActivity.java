package io.github.nitya.udacityportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void showToast(View view) {

        CharSequence text;
        switch (view.getId()) {
            case R.id.launchBuild:
                text = "This button will launch my Build it Bigger app!";
                break;
            case R.id.launchCapstone:
                text = "This button will launch my Capstone app!";
                break;
            case R.id.launchLibrary:
                text = "This button will launch my Library app!";
                break;
            case R.id.launchScores:
                text = "This button will launch my Scores app!";
                break;
            case R.id.launchSpotify:
                text = "This button will launch my Spotify Streamer app!";
                break;
            case R.id.launchXYZ:
                text = "This button will launch my XYZ Reader app!";
                break;
            default:
                text = "This button lives outside my control. Watch out!";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
