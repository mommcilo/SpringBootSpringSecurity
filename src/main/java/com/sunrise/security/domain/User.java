package com.sunrise.security.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by momcilodavidovic on 12/22/16.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private UserRole userRole;

    protected User() {}

    public User(String username, String password, String name, String email, UserRole userRole) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public boolean isAdmin(){
        return userRole.equals(UserRole.Role.ADMIN);
    }
}
