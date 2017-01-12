package com.sunrise.security.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by momcilodavidovic on 1/8/17.
 */
@Entity
public class UserRole {

    enum Role {
        USER,
        ADMIN
    }

    private UserRole() {}

    UserRole(Role role){
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
