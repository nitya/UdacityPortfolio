package io.github.nitya.udacityportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
