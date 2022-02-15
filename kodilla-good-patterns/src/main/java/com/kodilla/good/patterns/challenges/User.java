package com.kodilla.good.patterns.challenges;

public class User {

    private String userNick;
    private String userName;
    private String userSurname;
    private String userEmail;

    public User(String userNick, String userName, String userSurname,
                String userEmail) {
        this.userNick = userNick;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNick='" + userNick + '\'' +
                ", userName='" + userName +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail +
                '}';
    }
}
