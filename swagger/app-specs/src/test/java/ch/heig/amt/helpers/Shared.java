package ch.heig.amt.helpers;

import ch.heig.amt.api.dto.User;

public class Shared {

    private User user;
    private int statusCode;

    public Shared(User user) {

        this.user = user;
        user.setLogin("cyril");
        user.setPass("amt");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User fruit) {
        this.user = user;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
