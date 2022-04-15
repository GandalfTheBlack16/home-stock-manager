package org.gandalftheblack.hsm.users.application.aggregate;

import org.gandalftheblack.hsm.users.application.commands.CreateUserCommand;
import org.gandalftheblack.hsm.users.application.commands.GetUserByIdCommand;
import org.gandalftheblack.hsm.users.application.commands.GetUserByMailCommand;
import org.gandalftheblack.hsm.users.application.commands.UpdateUserCommand;
import org.gandalftheblack.hsm.users.application.repository.UserQueryRepository;
import org.gandalftheblack.hsm.users.application.repository.UserWriteRepository;
import org.gandalftheblack.hsm.users.domain.User;

import java.util.UUID;

public class UserAggregate {

    private final UserWriteRepository userWriteRepository;
    private final UserQueryRepository userQueryRepository;

    public UserAggregate(UserWriteRepository userWriteRepository, UserQueryRepository userQueryRepository) {
        this.userWriteRepository = userWriteRepository;
        this.userQueryRepository = userQueryRepository;
    }

    public User handleUserCreation(CreateUserCommand command){
        User user = new User(
                command.name(),
                command.email(),
                command.password()
        );
        userWriteRepository.save(user);
        return user;
    }

    public User handleUserRetrieveById(GetUserByIdCommand command){
        User user = new User(
                command.userId()
        );
        return userQueryRepository.getUser(user);
    }

    public User handleUserRetrieveByMail(GetUserByMailCommand command){
        User user = new User(
                command.email()
        );
        return userQueryRepository.getUser(user);
    }

    public User handleUserUpdate(UpdateUserCommand command){
        User user = new User(
            command.name(),
            command.email(),
            command.password()
        );
        user.setId(command.userId());
        userWriteRepository.alter(user);
        return user;
    }
}
