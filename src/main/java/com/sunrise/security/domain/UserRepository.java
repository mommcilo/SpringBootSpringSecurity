package com.sunrise.security.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by momcilodavidovic on 12/23/16.
 */
@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
