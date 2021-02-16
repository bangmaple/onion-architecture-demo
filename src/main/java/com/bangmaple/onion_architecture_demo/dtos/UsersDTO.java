package com.bangmaple.onion_architecture_demo.dtos;

public class UsersDTO {
    private String username;
    private String password;
    private String fullname;
    private String roles;
    private String description;

    public UsersDTO() {
    }

    public UsersDTO(String username, String password, String fullname, String roles, String description) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.roles = roles;
        this.description = description;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
