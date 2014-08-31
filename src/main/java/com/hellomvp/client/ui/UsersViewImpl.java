package com.hellomvp.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.hellomvp.client.app.AbstractView;
import com.hellomvp.client.app.users.UsersView;

public class UsersViewImpl extends AbstractView<UsersView.Handler> implements UsersView {

    interface UsersViewImplUiBinder extends UiBinder<HTMLPanel, UsersViewImpl> {}

    private static UsersViewImplUiBinder ourUiBinder = GWT.create(UsersViewImplUiBinder.class);

    @UiField
    TextBox username;
    @UiField
    PasswordTextBox password;

    public UsersViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    public String getUserName() {
        return username.getValue();
    }

    @Override
    public String getPassword() {
        return password.getValue();
    }

    @UiHandler("save")
    public void onSaveClick(ClickEvent e) {
        getHandler().onSave();
    }
}