package org.gandalftheblack.hsm.users.application.repository;

import org.gandalftheblack.hsm.users.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserQueryRepository {

    List<User> getUsers();
    User getUser(User user);
}
