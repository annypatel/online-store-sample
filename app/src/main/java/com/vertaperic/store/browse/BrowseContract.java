/*
 * Project    : RetailStoreApp
 * File       : BrowseContract
 * Created on : 11/4/2016 9:48 PM
 */
package com.vertaperic.store.browse;

import com.vertaperic.store.app.BasePresenter;
import com.vertaperic.store.app.BaseView;

/**
 * This interface specifies the contract between the Browse screen view and the presenter.
 *
 * @author Anny Patel
 */
public interface BrowseContract {

    /**
     * The view interface for Browse screen functionality.
     */
    interface View extends BaseView {

        /**
         * To show the navigation view.
         */
        void showNavigationView();

        /**
         * To show my cart screen.
         */
        void showMyCartScreen();
    }

    /**
     * The presenter interface for Browse screen functionality.
     */
    interface Presenter extends BasePresenter {

    }
}
