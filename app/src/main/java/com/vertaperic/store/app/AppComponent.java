/*
 * Project    : RetailStoreApp
 * File       : AppComponent
 * Created on : 10/11/16 7:23 PM
 */
package com.vertaperic.store.app;

import com.vertaperic.android.database.DatabaseController;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * The dagger component for the app, manages application level dependencies, annotated as singleton
 * and {@link App} will ensure that only one instance of the class is created.
 *
 * @author Anny Patel
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppInjectionModule.class,
        AppModule.class
})
public interface AppComponent extends AndroidInjector<App> {

    /**
     * To get the database controller.
     *
     * @return The database controller.
     */
    DatabaseController getDatabaseController();


    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {

        abstract Builder appModule(AppModule appModule);
    }
}
