package org.gandalftheblack.hsm.users.application.commands;

import java.util.UUID;

public class GetUserByIdCommand {

    private UUID userId;

    public GetUserByIdCommand(){}

    public UUID userId() {
        return userId;
    }

    public GetUserByIdCommand setUserId(UUID userId) {
        this.userId = userId;
        return this;
    }
}
