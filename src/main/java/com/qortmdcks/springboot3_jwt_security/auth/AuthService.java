package com.qortmdcks.springboot3_jwt_security.auth;

import com.qortmdcks.springboot3_jwt_security.config.JwtService;
import com.qortmdcks.springboot3_jwt_security.token.TokenRepository;
import com.qortmdcks.springboot3_jwt_security.user.User;
import com.qortmdcks.springboot3_jwt_security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public ResponseEntity<?> register(RegisterRequest request){

        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();

        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("User register successfully"));

    }

    public AuthResponse login(LoginRequest request){
        return null;
    }
}
