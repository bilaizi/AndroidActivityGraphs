package com.example.bilaizi.androidactivitygraphs.ui;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.bilaizi.androidactivitygraphs.ActivityModule;
import com.example.bilaizi.androidactivitygraphs.DemoApplication;

import javax.inject.Inject;

public class HomeActivity extends FragmentActivity {

    @Inject
    LocationManager locationManager;
    private HomeComponent component;

    HomeComponent component() {
        if (component == null) {
            component = DaggerHomeComponent.builder()
                    .applicationComponent(((DemoApplication) getApplication()).component())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return component;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        component().inject(this);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, new HomeFragment())
                    .commit();
        }
        // TODO do something with the injected dependencies here!
    }
}
