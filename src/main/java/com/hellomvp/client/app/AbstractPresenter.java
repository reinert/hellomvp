package com.hellomvp.client.app;

import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractPresenter<V extends View<?>> implements Presenter {

    final V view;

    protected AbstractPresenter(V view) {
        this.view = view;
    }

    @Override
    public void unbind() {
        view.setHandler(null);
    }

    @Override
    public Widget asWidget() {
        return view.asWidget();
    }

    @Override
    public void onStart() {
    }

    @Override
    public String mayStop() {
        return null;
    }

    @Override
    public void onStop() {
    }

}
