package org.gandalftheblack.hsm.users.application.repository;

import org.gandalftheblack.hsm.users.domain.User;

public interface UserWriteRepository {

    void save(User user);
    void alter(User user);
}
