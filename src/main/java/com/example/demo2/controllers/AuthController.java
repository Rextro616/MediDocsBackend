package com.example.demo2.controllers;

import com.example.demo2.models.usuario.Usuario;
import com.example.demo2.utils.AuthCredentialRequest;
import com.example.demo2.utils.JWTUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    AuthenticationManager authenticationManager;

    JWTUtil jwtUtil;

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody  AuthCredentialRequest request){
        try{
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
            Usuario user = (Usuario) authentication.getPrincipal();
            user.setUsuarioContrasenia(null);
            return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION,jwtUtil.generateToken(user))
                    .body(user);
        }catch (BadCredentialsException  exception){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
