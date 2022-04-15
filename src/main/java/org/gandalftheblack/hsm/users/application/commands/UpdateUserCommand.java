package org.gandalftheblack.hsm.users.application.commands;

import org.gandalftheblack.hsm.users.domain.Role;

import java.util.UUID;

public class UpdateUserCommand {

    private UUID userId;
    private String name;
    private String email;
    private String password;
    private Role role;

    public UpdateUserCommand() {}

    public UUID userId() {
        return userId;
    }

    public UpdateUserCommand setUserId(UUID userId) {
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
