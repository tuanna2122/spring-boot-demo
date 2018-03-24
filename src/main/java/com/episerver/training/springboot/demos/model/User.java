package com.episerver.training.springboot.demos.model;

public class User {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(Long id) {
        this.id = id;
    }

}
