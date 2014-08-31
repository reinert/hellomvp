package com.hellomvp.client.app;

import com.google.gwt.user.client.ui.IsWidget;

public interface Presenter {
    String mayStop();

    void onStart();

    void onStop();
}
