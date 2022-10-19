package com.aspirant.portal.aspirantapi.service.impl;

import com.aspirant.portal.aspirantapi.models.User;
import com.aspirant.portal.aspirantapi.models.UserRole;
import com.aspirant.portal.aspirantapi.repo.RoleRepository;
import com.aspirant.portal.aspirantapi.repo.UserRepository;
import com.aspirant.portal.aspirantapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null){
            System.out.println("user is already there !!");
            try {
                throw new Exception("User already present !!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else{
            //user create
            for (UserRole ur : userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoleSet().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }
}
