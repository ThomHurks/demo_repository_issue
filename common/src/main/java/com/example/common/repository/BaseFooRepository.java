package com.example.common.repository;

import com.example.common.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BaseFooRepository <T extends Foo> extends JpaRepository<T, Long> {
}
