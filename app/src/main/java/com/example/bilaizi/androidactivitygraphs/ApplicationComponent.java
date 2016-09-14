package com.example.bilaizi.androidactivitygraphs;

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
// Constraints this component to one-per-application or unscoped bindings.
@Singleton
@Component(modules = DemoApplicationModule.class)
public interface ApplicationComponent {
    // Field injections of any dependencies of the DemoApplication
    void inject(DemoApplication application);

    // Exported for child-components.
    Application application();

    LocationManager locationManager();
}
