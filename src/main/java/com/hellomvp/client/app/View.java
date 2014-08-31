package com.hellomvp.client.app;

import com.google.gwt.user.client.ui.IsWidget;

public interface View<H extends ViewHandler> extends IsWidget {

    void setHandler(H handler);

    H getHandler();
}
