package org.gandalftheblack.hsm.users.application.repository;

import org.gandalftheblack.hsm.users.domain.user.User;

import java.util.UUID;

public interface UserWriteRepository extends AbstractWriteRepository<User, UUID>{
}
