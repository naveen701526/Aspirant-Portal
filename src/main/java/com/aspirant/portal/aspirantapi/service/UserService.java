package com.aspirant.portal.aspirantapi.service;

import com.aspirant.portal.aspirantapi.models.User;
import com.aspirant.portal.aspirantapi.models.UserRole;

import java.util.Set;

public interface UserService {

    //creating User
    public User createUser(User user, Set<UserRole> userRoles);


}
