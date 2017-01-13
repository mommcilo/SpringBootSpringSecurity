package com.sunrise.security;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by momcilodavidovic on 1/7/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SunriseUserManagementApplication.class)
@TestPropertySource(locations = "classpath:application.yaml")
public class BaseIntegrationTests {

    @Test
    public void base() {
    }

}
