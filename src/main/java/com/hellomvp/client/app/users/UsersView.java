package com.hellomvp.client.app.users;

import com.hellomvp.client.app.View;
import com.hellomvp.client.app.ViewHandler;

public interface UsersView extends View<UsersView.Handler> {
    String getUserName();
    String getPassword();

    public interface Handler extends ViewHandler {
        void onSave();
    }
}
