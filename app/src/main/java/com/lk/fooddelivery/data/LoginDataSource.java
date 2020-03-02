package com.lk.fooddelivery.data;

import com.lk.fooddelivery.data.model.LoginUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoginUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoginUser fakeUser =
                    new LoginUser(
                            java.util.UUID.randomUUID().toString(),
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
