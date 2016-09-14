package com.example.bilaizi.androidactivitygraphs.ui;

import com.example.bilaizi.androidactivitygraphs.AbstractActivityComponent;
import com.example.bilaizi.androidactivitygraphs.ActivityModule;
import com.example.bilaizi.androidactivitygraphs.ApplicationComponent;
import com.example.bilaizi.androidactivitygraphs.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface HomeComponent extends AbstractActivityComponent {
    void inject(HomeActivity homeActivity);
    void inject(HomeFragment homeFragment);
}
