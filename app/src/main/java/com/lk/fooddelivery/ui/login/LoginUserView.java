package com.lk.fooddelivery.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoginUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI

    LoginUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}
