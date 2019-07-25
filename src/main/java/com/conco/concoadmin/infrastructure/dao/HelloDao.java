package com.conco.concoadmin.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conco.concoadmin.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository <Hello, Integer> {

}
