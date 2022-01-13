package com.qhm.elasticsearch.datasources.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private Long id;

    private String name;

    private Byte gander;

    private Integer age;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getGander() {
        return gander;
    }

    public void setGander(Byte gander) {
        this.gander = gander;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}