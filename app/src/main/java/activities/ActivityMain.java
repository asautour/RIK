package activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import sautourltd.rik.R;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens up the legislation navigation module which allows for search / filtering / view of
     * the legislation.
     * @param view
     */
    public void openRegSearch(View view) {
        Intent legislationActivity = new Intent(this, ActivityRegSearch.class);
        startActivity(legislationActivity);
    }

    /**
     * TBD Open module for markets view
     */
}
