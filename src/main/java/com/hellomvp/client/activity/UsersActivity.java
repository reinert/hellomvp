package com.hellomvp.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.hellomvp.client.ClientFactory;
import com.hellomvp.client.app.AbstractPresenterActivity;
import com.hellomvp.client.app.Presenter;
import com.hellomvp.client.app.users.UsersPresenter;
import com.hellomvp.client.place.UsersPlace;

public class UsersActivity extends AbstractPresenterActivity {

    private final UsersPlace place;
    private final ClientFactory clientFactory;

    public UsersActivity(UsersPlace place, ClientFactory clientFactory) {
        this.place = place;
        this.clientFactory = clientFactory;
    }

    @Override
    public Presenter getPresenter(EventBus eventBus) {
        return new UsersPresenter(clientFactory.getUsersView());
    }

    @Override
    public void onStart(EventBus eventBus) {
        init();
    }

    /*
    @Override
    public void onCancel() {
        // nothing here
    }
    */
}
