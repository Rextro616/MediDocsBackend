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
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@RestController
@RequestMapping("/api/auth/")
@AllArgsConstructor

public class AuthController {

    AuthenticationManager authenticationManager;

    JWTUtil jwtUtil;

    @CrossOrigin(originPatterns = "*", methods = {RequestMethod.POST},
            allowedHeaders = "*", exposedHeaders = {HttpHeaders.AUTHORIZATION, HttpHeaders.EXPIRES}, allowCredentials = "true")
    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody  AuthCredentialRequest request){
        try{
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
            Usuario user = (Usuario) authentication.getPrincipal();

            String token = jwtUtil.generateToken(user);
            Date date = jwtUtil.getExpirationDateFromToken(token);
            ZoneId cstMexicoZoneId = ZoneId.of("America/Mexico_City");
            LocalDateTime cstMexicoDateTime = LocalDateTime.ofInstant(date.toInstant(), cstMexicoZoneId);
            user.setUsuarioContrasenia(token);

            return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, token).header(HttpHeaders.EXPIRES, String.valueOf(cstMexicoDateTime))
                    .body(user);
        }catch (BadCredentialsException  exception){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
