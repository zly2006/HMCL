package org.jackhuang.hmcl.ui.account;

import com.jfoenix.controls.JFXDialogLayout;

public class RemoveAccountPanel extends JFXDialogLayout {
    private final AccountListItem skinnable;

    public RemoveAccountPanel(AccountListItem skinnable) {
        this.skinnable = skinnable;
    }
}
