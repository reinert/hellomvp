package com.hellomvp.client.app;

public abstract class AbstractPresenter implements Presenter {

    @Override
    public void onStart() {}
    @Override
    public String mayStop() {return null;}
    @Override
    public void onStop() {}

}
