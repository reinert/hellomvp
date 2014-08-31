package com.hellomvp.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.hellomvp.client.ClientFactory;
import com.hellomvp.client.app.users.UsersPresenter;
import com.hellomvp.client.place.UsersPlace;

public class UsersActivity extends AbstractActivity {

    private final UsersPlace place;
    private final ClientFactory clientFactory;
    private UsersPresenter usersPresenter;

    public UsersActivity(UsersPlace place, ClientFactory clientFactory) {
        this.place = place;
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        usersPresenter = new UsersPresenter(clientFactory.getUsersView());
        usersPresenter.onStart();
        panel.setWidget(clientFactory.getUsersView());
    }

    @Override
    public String mayStop() {
        return usersPresenter.mayStop();
    }

    @Override
    public void onCancel() {
        // nothing here
    }

    @Override
    public void onStop() {
        usersPresenter.onStop();
        clientFactory.getUsersView().setHandler(null);
        usersPresenter = null;
    }
}
