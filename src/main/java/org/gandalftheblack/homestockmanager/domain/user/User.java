package org.gandalftheblack.homestockmanager.domain.user;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private UUID id;
    private String name;
    private String email;
    private String password;
    private Role role;

    public User(String name, String email, String password) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.password = password;
        role = Role.INACTIVE;
    }
}
