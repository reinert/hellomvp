package com.hellomvp.client.app;

import com.google.gwt.user.client.ui.IsWidget;

public interface Presenter extends IsWidget {

    void bind();

    void unbind();

    String mayStop();

    void onStart();

    void onStop();
}
