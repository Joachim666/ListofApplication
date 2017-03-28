package com.sdacademy.otto.joachim.listofapplication;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main)
    CoordinatorLayout mainLayout;


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        showSnackBar();
    }

    private void showSnackBar() { // snakbar tylko z CoordinatorLayout
        Snackbar snackbar = Snackbar.make(mainLayout,"Data loaded", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // tutaj instaluje nasze menu

        this.getMenuInflater().inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // menu reaguje na przycisk
        switch (item.getItemId()){
            case R.id.menu_settings:
                openSettings();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void openSettings() {
        Log.d(TAG,"dziala");
        SettingDialogFragment settingsDialogFragment = SettingDialogFragment.newInstance();
        settingsDialogFragment.show(getSupportFragmentManager(),"");




    }
}
