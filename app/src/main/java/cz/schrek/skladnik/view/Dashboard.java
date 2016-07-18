package cz.schrek.skladnik.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cz.schrek.skladnik.R;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        settingsOnCreate();
    }

    private void settingsOnCreate() {
        setTitle(getString(R.string.title_dashboard));
    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
