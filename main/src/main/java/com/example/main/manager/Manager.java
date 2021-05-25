package com.example.main.manager;

import com.example.main.repository.FooRepository;

public class Manager {

    private final FooRepository fooRepository;

    public Manager(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }
}
