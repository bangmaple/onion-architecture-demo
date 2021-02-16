package com.bangmaple.onion_architecture_demo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users", catalog = "OnionArchDemo", schema = "dbo")
public class UsersEntity {
    @Id
    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "roles", length = 100, nullable = false)
    private String role;

    @Column(name = "description", length = Integer.MAX_VALUE, nullable = true)
    private String description;

    @Column(name = "fullname", length = 100, nullable = false)
    private String fullname;

    public UsersEntity(String username) {
        this.username = username;
    }

    public UsersEntity(String username, String password, String role, String description, String fullname) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.description = description;
        this.fullname = fullname;
    }

    public UsersEntity() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
