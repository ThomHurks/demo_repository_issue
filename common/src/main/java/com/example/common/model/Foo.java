package com.example.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
