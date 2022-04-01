package org.gandalftheblack.homestockmanager.application.aggregate;

import org.gandalftheblack.homestockmanager.application.command.CreateUserCommand;
import org.gandalftheblack.homestockmanager.application.command.UpdateUserCommand;
import org.gandalftheblack.homestockmanager.application.repository.UserWriteRepository;
import org.gandalftheblack.homestockmanager.domain.user.User;

import java.util.UUID;

public class UserAggregate {

    private final UserWriteRepository userWriteRepository;

    public UserAggregate(UserWriteRepository userWriteRepository) {
        this.userWriteRepository = userWriteRepository;
    }

    public User handleUserCreation(CreateUserCommand command){
        User user = new User(
                command.name(),
                command.email(),
                command.password()
        );
        userWriteRepository.save(user, user.getId());
        return user;
    }

    public User handleUserUpdate(UpdateUserCommand<UUID> command){
        User user = new User(
            command.name(),
            command.email(),
            command.password()
        );
        user.setId(command.userId());
        userWriteRepository.alter(user, user.getId());
        return user;
    }
}
