package com.example.bilaizi.androidactivitygraphs;

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Inject;

public class DemoApplication extends Application {
    private ApplicationComponent applicationComponent;

    // TODO(cgruber): Figure out a better example of something one might inject into the app.
    @Inject
    LocationManager locationManager; // to illustrate injecting something into the app.

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .demoApplicationModule(new DemoApplicationModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return applicationComponent;
    }
}
