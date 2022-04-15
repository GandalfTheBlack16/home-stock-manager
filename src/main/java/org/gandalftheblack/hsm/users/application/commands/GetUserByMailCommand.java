package org.gandalftheblack.hsm.users.application.commands;

public class GetUserByMailCommand {

    private String email;

    public String email() {
        return email;
    }

    public GetUserByMailCommand setEmail(String email) {
        this.email = email;
        return this;
    }
}
