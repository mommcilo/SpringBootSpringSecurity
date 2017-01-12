package com.sunrise.security.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by momcilodavidovic on 1/8/17.
 */
@Transactional
@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long>{
}
