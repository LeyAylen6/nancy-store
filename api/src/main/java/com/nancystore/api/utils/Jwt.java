package com.nancystore.api.utils;

import com.nancystore.api.models.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
public class Jwt {
    private static final String SECRET_KEY = "test";

    public static String generateToken(Long userId, User.Role role) {
        return Jwts.builder()
                .claim("id", userId)
                .claim("role", role)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public static Object decodeJWT(String token) {
        return Jwts
                .parser()
                .setSigningKey(SECRET_KEY)
                .build()
                .parseEncryptedClaims(token)
                .getBody()
                .get("role", User.Role.class);
    }
}
