package com.example.bilaizi.androidactivitygraphs;

import android.app.Activity;

import dagger.Component;

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 */
// Subtypes of AbstractActivityComponent should be decorated with @PerActivity.
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface AbstractActivityComponent {
    // Expose the activity to sub-graphs.
    Activity activity();
}
