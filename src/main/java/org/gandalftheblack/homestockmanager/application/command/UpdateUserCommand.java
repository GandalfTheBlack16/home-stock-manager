package org.gandalftheblack.homestockmanager.application.command;

import org.gandalftheblack.homestockmanager.domain.user.Role;

public class UpdateUserCommand <T> {

    private T userId;
    private String name;
    private String email;
    private String password;
    private Role role;

    public UpdateUserCommand() {}

    public T userId() {
        return userId;
    }

    public UpdateUserCommand<T> setUserId(T userId) {
        this.userId = userId;
        return this;
    }

    public String name() {
        return name;
    }

    public UpdateUserCommand setName(String name) {
        this.name = name;
        return this;
    }

    public String email() {
        return email;
    }

    public UpdateUserCommand setEmail(String email) {
        this.email = email;
        return this;
    }

    public String password() {
        return password;
    }

    public UpdateUserCommand setPassword(String password) {
        this.password = password;
        return this;
    }

    public Role role() {
        return role;
    }

    public UpdateUserCommand setRole(Role role) {
        this.role = role;
        return this;
    }
}
