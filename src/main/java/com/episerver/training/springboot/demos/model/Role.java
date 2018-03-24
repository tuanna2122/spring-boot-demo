package com.episerver.training.springboot.demos.model;

public class Role {

    private Long id;

    private String code;

    public Role(Long id) {
        this.id = id;
    }

    public Role(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
