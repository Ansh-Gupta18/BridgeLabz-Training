package com.oopsScenarioBased.EventEase;

class User {
    private String name;
    private String email;     // sensitive
    private String phone;     // sensitive

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
