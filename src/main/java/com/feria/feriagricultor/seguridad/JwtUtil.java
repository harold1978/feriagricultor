package com.feria.feriagricultor.seguridad;

import java.security.Key;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
@Component
public class JwtUtil {
    
    @Value("${jwt.secret}")
    private String secret;
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    
    public String generarToken(String username) {
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(Date.from(Instant.now().plus(Duration.ofDays(1))))
            .signWith(key)
          //  .signWith(SignatureAlgorithm.HS256, secret)
            //.signWith(key)
            .compact();
    }
    public String validarToken(String token) {
        return Jwts.parser()
            .setSigningKey(key)
                
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
    }
}