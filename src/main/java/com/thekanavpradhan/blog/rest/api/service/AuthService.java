package com.thekanavpradhan.blog.rest.api.service;

import com.thekanavpradhan.blog.rest.api.payload.LoginDto;
import com.thekanavpradhan.blog.rest.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);

}
