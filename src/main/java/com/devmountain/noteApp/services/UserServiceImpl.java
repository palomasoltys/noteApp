package com.devmountain.noteApp.services;

import com.devmountain.noteApp.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private IUserRepository userRepository;
}
