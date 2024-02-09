
package com.example.Apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoders;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
@ComponentScan
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity) {

        httpSecurity
            // Configure security for different paths
            .authorizeExchange()
//                .pathMatchers("/public/**").permitAll() // Example: Allow public access to certain paths
                .anyExchange().authenticated() // Authenticate for any other path
                .and()
            .oauth2Client() // Configure OAuth 2.0 client settings
                .and()
            .oauth2ResourceServer() // Configure OAuth 2.0 resource server settings
                .jwt(); // Use JWT as the token type

        return httpSecurity.build();
    }

//    @Bean
//    public ReactiveJwtDecoder jwtDecoder() {
//        return ReactiveJwtDecoders.fromOidcIssuerLocation("https://dev-06594147.okta.com/oauth2/default");
//    }
}
