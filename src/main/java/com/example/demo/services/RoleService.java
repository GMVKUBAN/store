package com.example.demo.services;


import com.example.demo.entities.Role;
import com.example.demo.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role getUserRole () {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
