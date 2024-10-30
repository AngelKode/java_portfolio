package com.kode.simple_app.model;

public class UserDTO {
    private final Long id;
    private final String name, lastName;
    private final int age;

    public UserDTO(String _name, String _lastName, int _age,Long _id){
        this.name = _name;
        this.lastName = _lastName;
        this.age = _age;
        this.id = _id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }
}
