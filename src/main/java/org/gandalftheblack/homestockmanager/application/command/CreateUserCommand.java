package org.gandalftheblack.homestockmanager.application.command;

import java.util.UUID;

public class CreateUserCommand {
    private UUID user_id;
    private String name;
    private String email;
    private String password;

    public CreateUserCommand(){}

    public UUID user_id() {
        return user_id;
    }

    public CreateUserCommand setUser_id(UUID user_id) {
        this.user_id = user_id;
        return this;
    }

    public String name() {
        return name;
    }

    public CreateUserCommand setName(String name) {
        this.name = name;
        return this;
    }

    public String email() {
        return email;
    }

    public CreateUserCommand setEmail(String email) {
        this.email = email;
        return this;
    }

    public String password() {
        return password;
    }

    public CreateUserCommand setPassword(String password) {
        this.password = password;
        return this;
    }
}
