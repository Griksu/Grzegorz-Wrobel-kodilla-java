package com.kodilla.good.patterns.food2door;

public class User {

    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPhoneNumber;

    public User(String userName, String userSurname, String userEmail, String userPhoneNumber) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
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

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
}