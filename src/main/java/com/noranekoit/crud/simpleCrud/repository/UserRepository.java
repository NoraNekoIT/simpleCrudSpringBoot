package com.noranekoit.crud.simpleCrud.repository;

import com.noranekoit.crud.simpleCrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
