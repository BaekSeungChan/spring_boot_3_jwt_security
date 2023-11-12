package com.qortmdcks.springboot3_jwt_security.auth;

import com.qortmdcks.springboot3_jwt_security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;

    public AuthResponse register(RegisterRequest request){
        return null;
    }

    public AuthResponse login(LoginRequest request){
        return null;
    }
}
