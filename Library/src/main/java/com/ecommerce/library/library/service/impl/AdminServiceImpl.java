package com.ecommerce.library.library.service.impl;

import com.ecommerce.library.library.dto.AdminDto;
import com.ecommerce.library.library.model.Admin;
import com.ecommerce.library.library.repository.AdminRepository;
import com.ecommerce.library.library.repository.RoleRepository;
import com.ecommerce.library.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
