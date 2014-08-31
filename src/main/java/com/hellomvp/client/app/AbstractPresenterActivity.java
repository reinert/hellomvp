package com.hellomvp.client.app;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.hellomvp.client.ClientFactory;
import com.hellomvp.client.app.Presenter;
import com.hellomvp.client.app.View;
import com.hellomvp.client.app.users.UsersPresenter;
import com.hellomvp.client.place.UsersPlace;

public abstract class AbstractPresenterActivity extends AbstractActivity {

    private Presenter presenter;
    private AcceptsOneWidget panel;

    public abstract Presenter getPresenter(EventBus eventBus);

    public abstract void onStart(EventBus eventBus);

    public final void init() {
        presenter.onStart();
        panel.setWidget(presenter.asWidget());
    }

    @Override
    public final void start(AcceptsOneWidget panel, EventBus eventBus) {
        this.panel = panel;
        this.presenter = getPresenter(eventBus);
        this.presenter.bind();
        onStart(eventBus);
    }

    @Override
    public String mayStop() {
        return presenter.mayStop();
    }

    @Override
    public void onStop() {
        presenter.onStop();
        presenter.unbind();
    }
}
