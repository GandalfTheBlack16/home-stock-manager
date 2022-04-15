package org.gandalftheblack.hsm.users.application.repository;

import org.gandalftheblack.hsm.users.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserQueryRepository {

    List<User> getUsers();
    User getUser(User user);
}
