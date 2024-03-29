package com.hellomvp.client.app.users;

import com.hellomvp.client.app.AbstractPresenter;

public class UsersPresenter extends AbstractPresenter<UsersView> implements UsersView.Handler {

    private final UsersView view;

    public UsersPresenter(UsersView view) {
        super(view);
        this.view = view;
    }

    @Override
    public void bind() {
        view.setHandler(this);
    }

    /*
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
    */

    @Override
    public void onSave() {

    }
}
