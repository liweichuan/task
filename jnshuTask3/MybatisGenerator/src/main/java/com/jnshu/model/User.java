package com.jnshu.model;

public class User {
    private Long id;

    private String user;

    private String password;

    private String nickname;

    private Long create_time;

    private String creator;

    public User(Long id, String user, String password, String nickname, Long create_time, String creator) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.nickname = nickname;
        this.create_time = create_time;
        this.creator = creator;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}