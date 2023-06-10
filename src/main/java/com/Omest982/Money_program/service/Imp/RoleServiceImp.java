package com.Omest982.Money_program.service.Imp;

import com.Omest982.Money_program.model.Role;
import com.Omest982.Money_program.repository.RoleRepository;
import com.Omest982.Money_program.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getByName(String name) {
        return roleRepository.findByName(name).orElse(null);
    }
}
