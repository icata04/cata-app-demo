package com.example.cataappdemo.dto;

public class UserDto {
    private String name;
    private String email;
    private String accesType;


    public UserDto(String name, String email, String accesType) {
        this.name = name;
        this.email = email;
        this.accesType = accesType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccesType() {
        return accesType;
    }

    public void setAccesType(String accesType) {
        this.accesType = accesType;
    }
}
