package com.example.demo.service;

import com.example.demo.entity.Admin;

public interface AdminService {

    Admin register(Admin admin);

    String login(String email, String password);
}
