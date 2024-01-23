package com.example.demo.repositories;

import com.example.demo.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository <Role, Integer> {
    Optional<Role> findByName (String name);
}
