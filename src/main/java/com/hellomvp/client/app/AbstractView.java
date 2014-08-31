package com.hellomvp.client.app;

import com.google.gwt.user.client.ui.Composite;

public abstract class AbstractView<H extends ViewHandler> extends Composite implements View<H> {

    private H handler;

    @Override
    public void setHandler(H handler) {
        this.handler = handler;
    }

    @Override
    public H getHandler() {
        if (handler == null)
            throw new ViewNotBoundException("There's no Presenter bound to this View.");
        return handler;
    }
}
