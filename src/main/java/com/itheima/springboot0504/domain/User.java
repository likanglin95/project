package com.itheima.springboot0504.domain;

public class User {
    private String username;
    private String password;
    private String phone;
    private String email;
    private String id;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User(String username, String password, String phone, String email, String id) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    public User() {
    }
}
