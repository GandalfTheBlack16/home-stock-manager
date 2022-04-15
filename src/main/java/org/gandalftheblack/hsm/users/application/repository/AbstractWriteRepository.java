package org.gandalftheblack.hsm.users.application.repository;

public interface AbstractWriteRepository<T,K> {

    void save(T entity, K id);
    void alter(T entity, K id);
}
