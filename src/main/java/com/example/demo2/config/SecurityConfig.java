package com.example.demo2.config;

import com.example.demo2.filter.JWTFilter;
import com.example.demo2.services.UsuarioService;
import com.example.demo2.utils.CustomPasswordEncoder;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UsuarioService userDetailsService;

    @Autowired
    CustomPasswordEncoder passwordEncoder;

    @Autowired
    JWTFilter jwtFilter;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder.getPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http = http.csrf().disable().cors().disable();
        http = http.sessionManagement()
                   .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                   .and();
        http = http.exceptionHandling()
                   .authenticationEntryPoint((request, response, ex) -> {
                       response.sendError(HttpServletResponse.SC_UNAUTHORIZED, ex.getMessage());
                }).and();
        http.authorizeRequests()
                .antMatchers("/api/auth/**")
                .permitAll()
            .anyRequest().authenticated();
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }

//    public static final String[] ENDPOINTS_WHITELIST = {
//            "/",
//    };
//
//
//  //  @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.authorizeRequests(request ->
//                        request.antMatchers(ENDPOINTS_WHITELIST).permitAll()
//                                .anyRequest().authenticated())
//                .csrf().disable()
//                .build();
//    }
//    //@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}