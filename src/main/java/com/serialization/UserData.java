package com.serialization;

import java.io.Serializable;

public class UserData implements Serializable {
    private static final long serialVersionUID = 7526472295622776147L;
    private String email;
    private String userName;
    private String password;

    UserData(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


}
