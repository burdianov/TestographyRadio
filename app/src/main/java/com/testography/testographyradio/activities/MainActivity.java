package com.testography.testographyradio.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.testography.testographyradio.R;
import com.testography.testographyradio.fragments.DetailsFragment;
import com.testography.testographyradio.fragments.MainFragment;
import com.testography.testographyradio.model.Station;

public class MainActivity extends AppCompatActivity {

    private static MainActivity sMainActivity;

    public static MainActivity getMainActivity() {
        return sMainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        sMainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("blah", "kah");
            fm.beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }
    }

    public void loadDetailsScreen(Station selectedStation) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main, new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }
}
