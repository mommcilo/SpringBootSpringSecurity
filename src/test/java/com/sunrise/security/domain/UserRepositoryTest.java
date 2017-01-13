package com.sunrise.security.domain;


import com.sunrise.security.BaseIntegrationTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by momcilodavidovic on 12/23/16.
 */
public class UserRepositoryTest extends BaseIntegrationTests{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    private UserRole userRole;

    @Before
    public void setUp(){
        userRole = new UserRole(UserRole.Role.USER);
        userRoleRepository.save(userRole);
    }

    @Test
    public void shouldFindUserByUsername() throws Exception {
        userRepository.save(new User("root", "root", "testName", "test@email.com", userRole));
        User user = userRepository.findByUsername("root");
        Assert.assertEquals(user.getUsername(),"root");
        Assert.assertEquals(user.getEmail(),"test@email.com");
    }

}